package com.example.lab1_ph30902_ktl

fun main() {
    /*Được định nghĩa với từ khóa vararg, cho phép bạn truyền một số lượng biến đối số không xác định
     của kiểu dữ liệu được chỉ định (trong trường hợp này là các chuỗi).
     */
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2


    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

class vidu4 {
}