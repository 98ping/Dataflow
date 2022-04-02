package ltd.matrixstudios.mongo.query

import com.mongodb.client.FindIterable
import ltd.matrixstudios.mongo.MongoDataFlow
import org.bson.Document

data class Query<T>(
    val owningClass: Class<T>
) {

    fun find() : FindIterable<Document> {
        return MongoDataFlow.instance.getCollection(owningClass).find()
    }

    fun toList() : List<T> {
        return find().map { MongoDataFlow.instance.mainSerializer.serialize(it.toJson(), owningClass) }.toCollection(arrayListOf())
    }

}


