package chap03.section3

fun main() {
    shortFunc1(3) {
        println("First Call: $it")
        return
    }
}


inline fun shortFunc1(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After Calling out()")
}