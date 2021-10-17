package chapter06.java

class Kcustomer {

    companion object {
        const val Level = "Intermediate"
        @JvmStatic
        fun login() = println("Login")
        @JvmField
        var JOB = Kjob()
    }
}

class Kjob {
    var title: String = "Programmer"
}
