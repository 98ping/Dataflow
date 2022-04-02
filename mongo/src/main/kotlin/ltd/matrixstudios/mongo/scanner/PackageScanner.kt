package ltd.matrixstudios.mongo.scanner

import ltd.matrixstudios.mongo.clazz.ClassUtil
import ltd.matrixstudios.mongo.annotation.Collection
import ltd.matrixstudios.mongo.exception.ClassNotStoredException

object PackageScanner {

    var annotations = hashMapOf<Class<*>, String>()

    fun get(clazz: Class<*>) : String {
        val finalString = annotations[clazz]
            ?: throw ClassNotStoredException("class was unable to be found in the annotation map")

        return finalString

    }

    fun scanPackage(pckge: String) {
        val classes = ClassUtil.findAllClasses(pckge)

        if (classes!!.isNotEmpty()) {
            val filteredClasses = classes.filter { it!!.getDeclaredAnnotation(Collection::class.java) != null }

            filteredClasses.forEach {
                annotations[it!!] = it.getDeclaredAnnotation(Collection::class.java).collectionName
            }
        }
    }
}