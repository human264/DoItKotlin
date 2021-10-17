package chapter06

object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init!")
    }
}

class CCustomer{
    companion object {
        const val HELLO = "hello"
        var name = "Joosol"
        @JvmField
        val HOBBY = Hobby("FootBall")
        @JvmStatic fun greeting() = println("Hello World!!")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, Hello = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}


