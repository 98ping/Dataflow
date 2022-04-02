package ltd.matrixstudios.mongo.clazz


import ltd.matrixstudios.mongo.annotation.Collection
import org.reflections.Reflections
import org.reflections.util.ClasspathHelper
import org.reflections.util.ConfigurationBuilder
import java.util.*


object ClassUtil {

    private const val PKG_SEPARATOR = '.'

    private const val DIR_SEPARATOR = '/'

    private const val CLASS_FILE_SUFFIX = ".class"

    private const val BAD_PACKAGE_ERROR =
        "Unable to get resources from path '%s'. Are you sure the package '%s' exists?"

    fun find(scannedPackage: String): Set<Class<*>> {
        val reflections = Reflections(
            ConfigurationBuilder()
                .setUrls(ClasspathHelper.forJavaClassPath())
        )
        val types: Set<Class<*>> = reflections.getTypesAnnotatedWith(Collection::class.java)
        return types
    }
}