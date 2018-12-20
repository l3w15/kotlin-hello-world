package com.watson.lewis.hello_world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller() {

    @GetMapping("/hello")
    fun helloKotlin(): String = "Hello, World"

}