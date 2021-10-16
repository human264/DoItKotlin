package chap03.section3

fun main() {
     shortFunc22(3) { println("First Call : $it")}


}

inline fun shortFunc22(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

