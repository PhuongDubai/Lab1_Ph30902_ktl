package com.example.lab1_ph30902_ktl

fun main() {
    //Hàm này định nghĩa một toán tử tùy chỉnh cho phép bạn nhân một số nguyên với một chuỗi.
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "Bye ")                                          // 2

    //Hàm này định nghĩa một toán tử tùy chỉnh cho phép bạn lấy một phần của chuỗi dựa trên một khoảng chỉ số.
    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}

class vidu3 {
}