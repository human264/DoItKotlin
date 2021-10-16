package chapter04.section01

fun main() {
    print("Enter the score:")

    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if(score >= 90) {
        grade = 'A'
    } else if(score >= 80 && score <=89.9) {
        grade = 'B'
    } else if(score >= 70 && score <= 79.9) {
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}