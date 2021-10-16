package chapter04.section01

fun main() {
    retFunc()
}

fun retFunc() {
   println("start of retFunc")
   inlineLamda(13, 3, fun(a,b) {

       val result =a+b
       if(result > 10) return
       println("result:$result")

   })
    println("end of retFunc")
}

fun inlineLamda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)

}
