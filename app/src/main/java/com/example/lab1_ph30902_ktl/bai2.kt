package com.example.lab1_ph30902_ktl

fun main() {
    var a = 0.0
    var b = 0.0
    println("Nhap a :")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("nhap b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tong:" + (a + b))
    println("Hieu:" + (a - b))
    println("Tich:" + (a * b))
    println("Thuong:" + (a / b))

}

class bai2 {
}