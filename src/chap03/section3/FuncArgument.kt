package chap03.section3

fun main() {
    val res1 = sum3(3, 2)
    val res2 = mul(sum3(3,3),3)

    println("res1: $res1, res2: $res2")

}


fun sum3(a: Int, b: Int) = a+b
fun mul(a: Int, b: Int) = a*b
