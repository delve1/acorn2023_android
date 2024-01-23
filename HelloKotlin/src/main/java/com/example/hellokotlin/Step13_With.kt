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

    val m1=Member()
    with(m1){
        num=1
        name="김구라"
        isMan=true
        showInfo()
    }

    val m2=Member()
    val a:Unit = with(m2){
        num=2
        name="해골"
        isMan=false
        showInfo()
    }

    val m3=Member()

    val result:String = with(m3){
        num=3
        name="원숭이"
        isMan=true
        //가장 마지막번째 line 이 리턴 값이다.
        "${this.num} ${this.name} ${this.isMan} 입니다"
    }
}