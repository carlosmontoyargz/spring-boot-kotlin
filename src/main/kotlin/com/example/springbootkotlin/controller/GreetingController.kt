package com.example.springbootkotlin.controller

import com.example.springbootkotlin.domain.Greeting
import com.example.springbootkotlin.repository.GreetingRepository
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController @Autowired constructor(
        val greetingRepository: GreetingRepository)
{
    val logger = LogManager.getLogger()!!

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting
    {
        val greeting = Greeting(content = "Hello $name!")
        logger.info(greeting.toUpperCase())
        return greetingRepository.save(greeting)
    }
}
