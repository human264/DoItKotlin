package chapter06.d

import chapter06.eee.LazyTest

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person by lazy {
        isPersonInstantiated = true
        Person("Kim", 23)
    }

    val personDelegate = lazy { Person("Hong", 40) }

    println("person init : $isPersonInstantiated")
    println("personDelegateInit: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person init : $isPersonInstantiated")
    println("personDelegateInit: ${personDelegate.isInitialized()}")


}
