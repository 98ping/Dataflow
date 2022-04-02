package ltd.matrixstudios.mongo.clazz


import java.io.File
import java.io.FileInputStream
import java.util.*
import java.util.jar.JarEntry
import java.util.jar.JarInputStream


object ClassUtil {

    fun getClassesInPackage(packageName: String): List<Class<*>> {
        val path = packageName.replace("\\.".toRegex(), File.separator)
        val classes: MutableList<Class<*>> = ArrayList()
        val classPathEntries = System.getProperty("java.class.path").split(
            System.getProperty("path.separator")
        ).toTypedArray()
        var name: String
        for (classpathEntry in classPathEntries) {
            if (classpathEntry.endsWith(".jar")) {
                val jar = File(classpathEntry)
                try {
                    val `is` = JarInputStream(FileInputStream(jar))
                    var entry: JarEntry
                    while (`is`.nextJarEntry.also { entry = it } != null) {
                        name = entry.name
                        if (name.endsWith(".class")) {
                            if (name.contains(path) && name.endsWith(".class")) {
                                var classPath = name.substring(0, entry.name.length - 6)
                                classPath = classPath.replace("[\\|/]".toRegex(), ".")
                                classes.add(Class.forName(classPath))
                            }
                        }
                    }
                } catch (ex: Exception) {
                    // Silence is gold
                }
            } else {
                try {
                    val base = File(classpathEntry + File.separatorChar + path)
                    for (file in base.listFiles()) {
                        name = file.name
                        if (name.endsWith(".class")) {
                            name = name.substring(0, name.length - 6)
                            classes.add(Class.forName("$packageName.$name"))
                        }
                    }
                } catch (ex: Exception) {
                    // Silence is gold
                }
            }
        }
        return classes
    }
}