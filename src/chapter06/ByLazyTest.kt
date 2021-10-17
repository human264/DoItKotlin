package chapter06.eee

class LazyTest() {
    init {
        println("lazy initialized")
    }
    val subject by lazy {
        println("lazy initialized")
        "kotlin Programming"
    }
    fun flow() {
        println("not initialized")
        println("subject one: $subject")
        println("subject two: $subject")
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}
