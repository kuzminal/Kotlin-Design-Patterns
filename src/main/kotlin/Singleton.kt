//Просто синглтон, без инициализации
object NoMoviesList {
}

object Logger {
    val file: String

    init {
        file = "myFile.exe"
        println("I was accessed for the first time")
        // Инициализация логгера, у singleton нет конструктора
    }
    // какой-то код
}