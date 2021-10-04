package chap02.section2


fun main() {
    var a =1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"

    println("str: \"$str1\", str2: \"$str2\"")
}