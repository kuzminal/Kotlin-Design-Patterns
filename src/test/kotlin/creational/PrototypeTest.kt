package creational

import Role
import User
import allUsers
import createUser
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PrototypeTest {
    var firstUser = User("first user", Role.ADMIN, setOf("permission1", "permission2"), listOf("task1", "task2"))

    @BeforeEach
    fun clearListOfUsers() {
        allUsers.removeAll { user -> user.name != "" }
    }

    @Test
    fun copyAndCompare() {
        allUsers.add(firstUser)
        createUser("another user", Role.ADMIN, listOf("task1", "task2"))
        val anotherUser = allUsers[1]
        assertEquals(anotherUser.permissions, firstUser.permissions)
        assertEquals(anotherUser.tasks, firstUser.tasks)
        assertEquals(anotherUser.name, "another user")
    }

    @Test
    fun createWithDifferentRole() {
        allUsers.add(firstUser)
        createUser("another user", Role.REGULAR_USER, listOf("task3"))
        val anotherUser = allUsers[1]
        assertEquals(anotherUser.permissions, setOf("permission3"))
        assertEquals(anotherUser.name, "another user")
        assertEquals(anotherUser.tasks, listOf("task3"))
        assertEquals(anotherUser.role, Role.REGULAR_USER)
    }
}