package com.example.hellokotlin

fun main(){
    val mem = mapOf<String, Any>("num" to 1, "name" to "김구라", "isMan" to true)

//    val num:Any? = mem.get("num")
//    val name:Any? = mem.get("name")
//    val isMan:Any? = mem.get("isMan")
    //아래와 같이 참조 할수도 있다
//    val num = mem["num"]
//    val name = mem["name"]
//    val isMan = mem["isMan"]

    //casting 까지 동시에 하기
    val num = mem.get("num") as Int // as 캐스팅할 type
    val name = mem.get("name") as String
    val isMan = mem.get("isMan") as Boolean

}