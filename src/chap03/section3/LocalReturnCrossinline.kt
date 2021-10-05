package chap03.section3


fun main() {
    shortFunc2(3) {
        println("First call: $it")
    }
}

inline fun shortFunc2(a: Int, crossinline out: (Int) -> Unit) {

    println("Before calling out()")
    nestedFunc { out(a) }

    println("After Calling out()")

}

fun nestedFunc(body: () -> Unit) {
    body()

}




