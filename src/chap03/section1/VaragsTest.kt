package chap03.section1


fun main() {
    normalVarags(1, 2, 3, 4)
    normalVarags(4,5,6)
}

fun normalVarags(vararg counts: Int) {
    for(num in counts) {
        print("$num ")
    }
    print("\n")
}
