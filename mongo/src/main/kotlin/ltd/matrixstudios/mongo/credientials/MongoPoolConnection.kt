package ltd.matrixstudios.mongo.credientials

import com.mongodb.MongoClient
import com.mongodb.MongoCredential
import com.mongodb.ServerAddress

data class MongoPoolConnection(
    var host: String,
    var port: Int,
    var requireAuth: Boolean
) {

    var password: String? = null
    var username: String? = null
    var authenticationDatabase: String? = null


    fun authenticate(username: String, password: String, authDatabase: String) : MongoPoolConnection {
        return this.apply {
            this.username = username
            this.password = password
            this.authenticationDatabase = authDatabase
        }

    }

    fun useClient() : MongoClient {
        return if (!requireAuth) {
            MongoClient(
                host,
                port
            )
        } else {
            MongoClient(
                ServerAddress(
                    host,
                    port
                ),
                listOf(
                    MongoCredential.createCredential(
                        username!!,
                        authenticationDatabase!!,
                        password!!.toCharArray()
                    )
                )
            )
        }
    }


}