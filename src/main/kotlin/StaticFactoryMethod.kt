class Server private constructor(serverPort: Long) {
    val port: Long
    init {
        port = serverPort
        println("Server started on port $port")
    }

    companion object {
        fun withPort(port: Long) = Server(port)
    }
}