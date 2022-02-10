//Просто синглтон, без инициализации
object NoMoviesList {
}

object Logger {
    const val file: String = "myFile.exe"

    init {
        println("I was accessed for the first time")
        // Инициализация логгера, у singleton нет конструктора
    }
    // какой-то код
}