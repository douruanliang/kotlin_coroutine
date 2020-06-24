package com.github.kotlin.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    //先在后台创建一个协程 执行{} 里面的内容
    GlobalScope.launch {
        delay(100)
        println("kotlin coroutines")
    }

    println("hello")
    Thread.sleep(1000)

    println("world")
}