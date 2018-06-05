package com.unibr.kotlindemo.endpoints

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyEndpoints {

    @GetMapping(path=["hello-world"])
    fun myFirstEndpoint(): String {
        return "Hello World"
    }
}