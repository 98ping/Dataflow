package ltd.matrixstudios.mongo.serialization.impl

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import com.google.gson.TypeAdapter
import ltd.matrixstudios.mongo.serialization.Serialization

object GsonSerializer : Serialization() {

    var gson: Gson = GsonBuilder().setPrettyPrinting().serializeNulls().setLongSerializationPolicy(LongSerializationPolicy.STRING).create()

    override fun <T> serialize(element: String, clazz: Class<T>): T {
        return gson.fromJson(element, clazz)
    }

    override fun <T> deserialize(t: T): String {
       return gson.toJson(t)
    }
}