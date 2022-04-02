package ltd.matrixstudios.mongo.clazz


import java.io.File
import java.util.*


object ClassUtil {

    private const val PKG_SEPARATOR = '.'

    private const val DIR_SEPARATOR = '/'

    private const val CLASS_FILE_SUFFIX = ".class"

    private const val BAD_PACKAGE_ERROR =
        "Unable to get resources from path '%s'. Are you sure the package '%s' exists?"

    fun find(scannedPackage: String): List<Class<*>>? {
        val scannedPath: String = scannedPackage.replace(PKG_SEPARATOR, DIR_SEPARATOR)
        val scannedUrl = Thread.currentThread().contextClassLoader.getResource(scannedPath)
            ?: throw IllegalArgumentException(java.lang.String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage))
        val scannedDir = File(scannedUrl.file)
        val classes: MutableList<Class<*>> = ArrayList()
        for (file in scannedDir.listFiles()) {
            classes.addAll(find(file, scannedPackage)!!)
        }
        return classes
    }

    private fun find(file: File, scannedPackage: String): List<Class<*>>? {
        val classes: MutableList<Class<*>> = ArrayList()
        val resource = scannedPackage + PKG_SEPARATOR.toString() + file.name
        if (file.isDirectory) {
            for (child in file.listFiles()) {
                classes.addAll(find(child, resource)!!)
            }
        } else if (resource.endsWith(CLASS_FILE_SUFFIX)) {
            val endIndex: Int = resource.length - CLASS_FILE_SUFFIX.length
            val className = resource.substring(0, endIndex)
            try {
                classes.add(Class.forName(className))
            } catch (ignore: ClassNotFoundException) {
            }
        }
        return classes
    }
}