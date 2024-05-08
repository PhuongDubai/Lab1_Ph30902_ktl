package com.example.lab1_ph30902_ktl

import android.net.IpPrefix

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String = "cc", prefix: String = "Info") {
    println("[$prefix] $message")
}

/*
1. `message` là một chuỗi (String) đại diện cho nội dung thông điệp mà bạn muốn in ra màn hình.
2. `prefix` cũng là một chuỗi (String), mặc định là "Info". Đối số này đại diện cho tiền tố mà bạn muốn thêm vào trước nội dung thông điệp.
 */
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y
fun main() {
    printMessage("xin chao")
    printMessageWithPrefix("Phuong", "Hello")
    printMessageWithPrefix()
    printMessageWithPrefix(prefix = "Nguyen", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}

class vidu1 {
}