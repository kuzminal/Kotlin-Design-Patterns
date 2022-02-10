class MailBuilder {
    private var _to: List<String> = listOf()
    private var _cc: List<String> = listOf()
    private var _title: String = ""
    private var _message: String = ""
    private var _important: Boolean = false

    class Mail internal constructor(
        val to: List<String>,
        val cc: List<String>?,
        val title: String?,
        val message: String?,
        val important: Boolean
    )

    fun build(): Mail {
        if (_to.isEmpty()) {
            throw RuntimeException("To property is empty")
        }
        return Mail(_to, _cc, _title, _message, _important)
    }

    fun message(message: String) = apply {
        _message = message
    }

    fun to(to: List<String>) = apply {
        _to = to
    }

    fun cc(cc: List<String>) = apply {
        _cc = cc
    }

    fun title(title: String) = apply {
        _title = title
    }

    fun important(important: Boolean) = apply {
        _important = important
    }
}