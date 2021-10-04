package chap03.section3

fun main() {
    println("funcFunc: ${funFunc()}")
}

fun sum(a: Int, b: Int) = a + b

fun funFunc(): Int {
    return sum(2,2)
}