package chap03.section3


fun main() {
    noParam({"Hello World!!"})
    noParam{"Hello World!!"}

    oneParam ({ a -> "Hello Wolrd $a" })
    oneParam { a -> "Hello Wolrd $a" }
    oneParam { "Hello Wolrd $it" }

    moreParam {a,b -> "Hello World $a, $b"}

    println("-------------------------------------------------------")
    moreParam {_,b -> "Hello World $b"}

    withArgs("Arg1", "Arg2", {a, b -> "Hello World!! $a, $b"})
    withArgs("Arg1", "Arg2") {a, b -> "Hello World!! $a, $b"}




}

fun withArgs(s: String, s1: String, out: (String, String) -> String) {
    println(out(s, s1))
}

fun moreParam(out: (String, String) -> String) {
    println(out("oneParam", "TwoParam"))
}

fun oneParam(out: (String) -> String) {
    println(out("one Param"))
}


fun noParam(out: () -> String) = println(out())