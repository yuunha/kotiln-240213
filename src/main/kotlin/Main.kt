package com.ll
import java.util.Scanner

fun main() {
//    val number = 10 // 불변 변수 선언 (val)
//    var message = "Hello, Kotlin!" // 문자열 변수 선언
//
//    println("Number: $number")  // $만 쓰면 문자열이 됨 -> 편리!
//    println("Message: $message")

    println("== 명언 앱 ==")


    //스캐너 객체 생성
    val scanner = Scanner(System.`in`)

    //조건 만족 시 종료
    while (true) {
        print("명령) ")

        //스캐너로 입력받기
        val cmd: String = scanner.nextLine()
        // 조건만족 시, break
        if (cmd == "종료") {
            break
        }
    }

    scanner.close()
}