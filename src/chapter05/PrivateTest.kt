package chapter05

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access() {
        privateFunc()
    }
}

class OtherClass {
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
}

fun TopFunction() {
    val tpc = PrivateClass()
}








