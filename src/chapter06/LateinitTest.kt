package chapter06

class Person {
    lateinit var name: String
    fun test() {
        if(!::name.isInitialized){
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}


fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "KilDong"
    kildong.test()
    println("name = ${kildong.name}")
}