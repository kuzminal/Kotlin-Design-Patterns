data class User(
    val name: String,
    val role: Role,
    val permissions: Set<String>,
    val tasks: List<String>,
) {
    fun hasPermission(permission: String) = permission in
            permissions
}

enum class Role {
    ADMIN,
    SUPER_ADMIN,
    REGULAR_USER
}

val allUsers = mutableListOf<User>()

fun createUser(_name: String, role: Role, _tasks: List<String>) {
    for (u in allUsers) {
        if (u.role == role) {
            allUsers += u.copy(name = _name, tasks = _tasks)
            return
        } else {
            allUsers += User(_name, role, setOf("permission3"), _tasks)
            return
        }
    }
}