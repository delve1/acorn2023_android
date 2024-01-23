package com.example.hellokotlin

fun main(){
    class Member{
        var num:Int?=null
        var name:String?=null
        var isMan:Boolean?=null
        fun showInfo(){
            println("${this.num}, ${this.name}, ${this.isMan}")
        }
    }

     val m1 = Member().apply {
        num=1
        name="김구라"
        isMan=true
        showInfo()
        //apply 는 this 를 리턴해준다

    }

    val m2 = with(Member()) {
        num=1
        name="김구라"
        isMan=true
        showInfo()
        //apply 는 this 를 리턴해준다

    }


}