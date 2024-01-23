package com.example.hellokotlin
/*
    [ java 에서 배열 만드는 방법이 2가지 있었다 ]
    정수를 담을수 있는 방5개 짜리 배열 만들기
    int[] nums = { 0, 0, 0, 0, 0 };


 */

fun main(){
    // 0 으로 초기화된 방 5개 짜리 Array 객체 만들기
    val nums = arrayOf(0,0,0,0,0);
    val nums2 = Array<Int>(5, {0});

    // 문자열을 담을수 있는 null
    val names = arrayOf<String?>(null, null, null)
    val names2 = Array<String?>(3, {null})
    val names3 = Array<String?>(3){null}

    val msgs = Array<String>(100){
        "메세지 $it"
    }

    msgs.forEach {
        println(it)
    }

}