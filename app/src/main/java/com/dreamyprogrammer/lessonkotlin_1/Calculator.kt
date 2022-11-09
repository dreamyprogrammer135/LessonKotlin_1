package com.dreamyprogrammer.lessonkotlin_1


const val PI = 3.14

class Calculator(val initValue: Int) {

    var name: String = ""
        set(value) {
            field = value.uppercase()
        }

    init {

    }

    constructor(aaaValue: Int, bbbValue: Int) : this(aaaValue) {

    }

    companion object {
        private fun staticFun() {
        }
    }


    fun plus(a: Int, b: Int): Int {
        staticFun()
        return a + b
    }

    fun div(a: Double, b: Double): Double {
        return if (b != 0.0) {
            a / b
        } else if (a > 0) {
            Double.POSITIVE_INFINITY
        } else {
            Double.POSITIVE_INFINITY
        }
    }

    fun asd() {
        val arrayList = mutableListOf<String>()
        arrayList.add("qwrqwer")

        arrayList.forEach {
            print(it)
        }

        for (str in arrayList) {
            print(str)
        }

        for (item in arrayList.withIndex()) {
            item.index
            item.value
        }

        for (i in 1..10) {
            print(arrayList[i])
        }

    }

    fun createViewHolder(viewType: Int): BaseViewHolder? {

        return when (viewType) {
            0 -> {
                MyViewHolder()
            }
            1 -> {
                CustomViewHolder()
            }
            2 -> {
                SuperViewHolder()
            }
            else -> {
                null
            }
        }
    }

    val vh = createViewHolder(2)
    fun bind() {
        vh?.apply {
            text = "olol"
            title = "OLOLO"
        }
    }
}

open class BaseViewHolder {
    var text: String = ""
    var title: String = ""

}

class MyViewHolder : BaseViewHolder {
    constructor() : super()
}

class CustomViewHolder : BaseViewHolder() {

}

class SuperViewHolder : BaseViewHolder() {

}

class Qqqq {

}

fun foo() {

}