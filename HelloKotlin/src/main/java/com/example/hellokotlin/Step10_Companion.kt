package com.example.hellokotlin

/*
    (in java)

    class Util{
        public static int number=10
        public static void pet(){ }
    }
    Util.get();
    Util.number;
 */

class Util{
    //Util 클래스와 함꼐하는 동반객체 (Companion Object)
    companion object{
        //동반객체의 필드와 메소드(함수)를 정의하면 된다
        val version:String="1.0"
        fun send(){
            println("전송합니다")
        }
    }
}

fun main(){
    //동반객체에 정의된 필드나 메소드를 클래스명에 .  찍어서 바로 사용할수 있다.
    Util.send()
    println(Util.version)
}

class Util2{
    companion object{
        //동반객체의 핃드와 메소드
        val version:String = "1.0"
        fun send(){

        }
    }
}

fun main2(){
    //동반객체에 정의된 필드나 메소드를 클래스명에 . 찍어서 바로 사용
    Util.send()
    println(Util.version)
}