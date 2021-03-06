package chapter05.section5.internal

open class Car protected constructor(_year:Int, _model:String, _power:String, _wheel:String) {
    private var year: Int = _year
    public var model: String = _model
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key) println("Start the Engine!")
    }

    class Driver(_name: String, _license: String) {
        private var name: String = _name
        var licence: String = _license
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean) :
    Car(_year, _model, _power, _wheel) {
    override var power: String = "50hp"
    val driver = Driver(name, "first class")

    constructor(_name: String, _key: Boolean) : this(2014,"basic", "100hp",
        "normal", _name, _key) {
        name = _name
        key = _key

    }

    fun access(password: String) {
        if (password == "gotico") {
            println("----[Tico] access) -----")
            println("super.model = ${super.model}")
            println("super.model = ${super.power}")
            println("super.model = ${super.wheel}")
            super.start(key)

            println("Driver().license = ${driver.licence}")
            driver.driving()
        } else {
            println("Your're a burglar")
        }
    }
}
class Burglar() {
    fun steal(anycar: Any) {
        if(anycar is Tico) {
            println("----------------------------[burglar] steal()")
            println("anycar.name = ${anycar.name}")
            println("anycar.wheel = ${anycar.wheel}")
            println("anycar.model = ${anycar.model}")
            println(anycar.driver.licence)
            anycar.driver.driving()
            anycar.access("dontknow")
        }else{
            println("Nothing to steal")
        }
    }
}

fun main() {
    val tico = Tico("kildong", true)
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}