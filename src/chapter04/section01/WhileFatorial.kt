package chapter04.section01

fun main() {
    print("Enter the Number : ")

    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while(number > 0) {
        factorial *= number
        --number
    }

    println("Factorial: $factorial")
}