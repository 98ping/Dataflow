package ltd.matrixstudios.mongo.query

import com.mongodb.client.FindIterable
import ltd.matrixstudios.mongo.MongoDataFlow

data class Query<T>(
    val owningClass: Class<T>
) {

    fun find() : FindIterable<T> {
        return MongoDataFlow.instance.getCollection(owningClass).find()
    }

    fun toList() : List<T> {
        return find().toCollection(arrayListOf())
    }

}


