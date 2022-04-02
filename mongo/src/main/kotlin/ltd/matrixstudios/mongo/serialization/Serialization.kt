package ltd.matrixstudios.mongo.serialization

abstract class Serialization {

    abstract fun <T> serialize(element: String, clazz: Class<T>) : T
    abstract fun <T> deserialize(t: T) : String
}