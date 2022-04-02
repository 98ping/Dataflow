package ltd.matrixstudios.mongo

import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters
import com.mongodb.client.model.UpdateOptions
import ltd.matrixstudios.mongo.annotation.Collection
import ltd.matrixstudios.mongo.credientials.MongoPoolConnection
import ltd.matrixstudios.mongo.query.Query
import ltd.matrixstudios.mongo.serialization.Serialization
import ltd.matrixstudios.mongo.serialization.impl.GsonSerializer
import org.bson.Document

class MongoDataFlow {

    lateinit var mongoClient: MongoClient
    lateinit var mongoDatabase: MongoDatabase

    var mainSerializer: Serialization = GsonSerializer

    companion object {
        lateinit var instance: MongoDataFlow
    }

    fun of() : MongoDataFlow {
        return this.apply {
            instance = this
        }
    }

    //if you use uri's suck it up and use individual credentials
    fun setPool(pool: MongoPoolConnection) : MongoDataFlow {
        return this.apply {
            this.mongoClient = pool.useClient()
        }
    }

    fun setDatabase(databaseName: String) : MongoDataFlow {
        return this.apply {
            this.mongoDatabase = mongoClient.getDatabase(databaseName)
        }
    }

    fun setSerializer(serialization: Serialization) : MongoDataFlow {
        return this.apply {
            this.mainSerializer = serialization
        }
    }

    fun <T> getCollection(owningClass: Class<T>) : MongoCollection<Document> {
        return mongoDatabase.getCollection(owningClass.getAnnotation(Collection::class.java).collectionName)
    }

    fun <T> delete(matchingId: String, owningClass: Class<T>) {
        getCollection(owningClass).deleteOne(Filters.eq("_id", matchingId))
    }

    fun <T> save(id: String, t: T, owningClass: Class<T>) {
        getCollection(owningClass).updateOne(
            Filters.eq("_id", id),
            Document(
                "\$set",
                Document.parse(
                   mainSerializer.deserialize(t)
                )
            ),
            UpdateOptions().upsert(true))
    }

    fun <T> createQuery(clazz: Class<T>) : Query<T> {
        return Query(clazz)
    }
}