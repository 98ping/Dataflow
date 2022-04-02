package ltd.matrixstudios.mongo.clazz


import sun.net.www.protocol.file.FileURLConnection
import java.io.File
import java.net.JarURLConnection
import java.net.URL
import java.net.URLConnection
import java.net.URLDecoder
import java.util.jar.JarEntry
import java.util.jar.JarInputStream


object ClassUtil {

    private fun checkDirectory(directory: File, packageName: String, classes: ArrayList<Class<*>>) {
        var tmpDirectory: File
        if (directory.exists() && directory.isDirectory) {
            val files = directory.list()
            if (files != null) {
                for (file in files) {
                    if (file.endsWith(".class")) {
                        try {
                            classes.add(Class.forName(packageName + '.' + file.substring(0, file.length - 6)))
                        } catch (ignored: NoClassDefFoundError) {
                        }
                    } else if (File(directory, file).also { tmpDirectory = it }.isDirectory) {
                        checkDirectory(tmpDirectory, "$packageName.$file", classes)
                    }
                }
            }
        }
    }

    private fun checkJarFile(connection: JarURLConnection, packageName: String, classes: ArrayList<Class<*>>) {
        val jarFile = connection.jarFile
        val entries = jarFile.entries()
        var name: String
        var jarEntry: JarEntry? = null
        while (entries.hasMoreElements() && entries.nextElement().also { jarEntry = it } != null) {
            name = jarEntry!!.name
            if (name.contains(".class")) {
                name = name.substring(0, name.length - 6).replace('/', '.')
                if (name.contains(packageName)) {
                    classes.add(Class.forName(name))
                }
            }
        }
    }

    fun getClassesInPackage(packageName: String): ArrayList<Class<*>> {
        val classes = ArrayList<Class<*>>()
        val cld = Thread.currentThread().contextClassLoader ?: throw ClassNotFoundException("Can't get class loader.")
        val resources = cld.getResources(packageName.replace('.', '/'))
        var connection: URLConnection
        var url: URL? = null
        while (resources.hasMoreElements() && resources.nextElement().also { url = it } != null) {
            connection = url!!.openConnection()
            if (connection is JarURLConnection) {
                checkJarFile(connection, packageName, classes)
            } else if (connection is FileURLConnection) {
                checkDirectory(File(URLDecoder.decode(url!!.path, "UTF-8")), packageName, classes)
            }
        }

        return classes
    }
}