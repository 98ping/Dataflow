package ltd.matrixstudios.mongo.annotation

import java.lang.annotation.Inherited


@MustBeDocumented
@Inherited
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
annotation class Collection(
    val collectionName: String
)