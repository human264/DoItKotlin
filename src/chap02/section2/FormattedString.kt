package chap02.section2

typealias Username = String
fun main() {
    val num = 10
    val formattedString = """
       val a = 5
       val b = "kotlin"
       println(a + $num)
       """

    println(formattedString)

    val userName: Username = "kildong"
    println(userName)

}

