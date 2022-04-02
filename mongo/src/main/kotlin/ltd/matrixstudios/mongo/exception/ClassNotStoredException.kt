package ltd.matrixstudios.mongo.exception

class ClassNotStoredException : RuntimeException {

    constructor(message: String?) : super(message) {}

    constructor(message: String?, cause: Throwable?) : super(message, cause) {}
}