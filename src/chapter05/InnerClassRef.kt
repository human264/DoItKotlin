package chapter05

open class Base {
    open val x:Int =1
    open fun f() = println("Base Class f()")

}

class Child:Base(){
    override val x: Int = super.x + 1
    override fun f() = println("Child class f()")

    inner class inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f()
            Child().f()
            super@Child.f()
            println("[Inside] super@Child.x : ${super@Child.x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.inside().test()
}


