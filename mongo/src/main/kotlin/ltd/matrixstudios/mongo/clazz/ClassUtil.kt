package ltd.matrixstudios.mongo.clazz


import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.stream.Collectors


object ClassUtil {

    fun findAllClasses(packageName: String): Set<Class<*>?>? {
        val stream: InputStream = ClassLoader.getSystemClassLoader()
            .getResourceAsStream(packageName.replace("[.]".toRegex(), "/"))
        val reader = BufferedReader(InputStreamReader(stream))
        return reader.lines()
            .filter { line: String -> line.endsWith(".class") }
            .map { line: String ->
                getClass(
                    line,
                    packageName
                )
            }
            .collect(Collectors.toSet())
    }

    private fun getClass(className: String, packageName: String): Class<*>? {
        try {
            return Class.forName(
                packageName + "."
                        + className.substring(0, className.lastIndexOf('.'))
            )
        } catch (e: ClassNotFoundException) {

        }
        return null
    }
}