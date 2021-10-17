package chapter06.wwewew

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("NONAME") {
        prop, old, new -> println("$old -> $new ; $prop")
    }
}

fun main() {
    val user = User()
    user.name = "Kildong"
    user.name = "Dooly"
}