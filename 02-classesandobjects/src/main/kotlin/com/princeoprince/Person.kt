package com.princeoprince

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {

//region Initialisation block
//    init {
//        if (name == "Kevin" && age < 54) throw Exception("Invalid age")
//    }
//endregion

//region Secondary constructor
//    var isMarried = false
//
//    constructor(name: String, age: Int, isMarried: Boolean) : this(name, age) {
//        this.isMarried = isMarried
//    }
//endregion

    var partnerName: String = ""

    override fun sign() = println("$name aged $age can sign documents (and their marital status is $isMarried)")

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person("Kevin", 21, true)
            p.sign()

            p.age = 54
            p.sign()

            p.partnerName = "Alex"

            println("Partner name is ${p.partnerName}")

            p.partnerName = "Bob"

            println("Partner name is ${p.partnerName}")
        }
    }
}

class Student(name: String, age: Int) : Person(name, age)

data class User(val name: String, val id: Int)

fun main(args: Array<String>) {
    val p = Person("Kevin", 21, true)
    p.sign()

    p.age = 54
    p.sign()

    val kevin = User("Kevin", 1)

    println(kevin)

    val (name, id) = kevin

    val otheruser = kevin.copy(id = 2)

    println("User is $name and their id is $id")
    println(otheruser)
}