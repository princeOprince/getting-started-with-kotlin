package com.princeoprince.kotlin

import com.princeoprince.java.Person
import java.lang.Exception

class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person()

            p.name = "Kevin"
//            p.setName("James")
            p.setName("")
            p.age = 54

            println("${p.name} is ${p.age} years old")

            try {
                p.name = ""
            } catch (e: Exception) {
                println(e.message)
            }

            val partner = p.partner

            println(partner?.name)
        }
    }
}

class Student : Person() {

}