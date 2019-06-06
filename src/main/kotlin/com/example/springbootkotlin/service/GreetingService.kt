package com.example.springbootkotlin.service

import com.example.springbootkotlin.domain.Greeting
import com.example.springbootkotlin.repository.GreetingRepository
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GreetingService
    @Autowired constructor(val greetingRepository: GreetingRepository)
{
    val logger = LogManager.getLogger()!!

    fun save(name: String): Greeting
    {
        val greeting = Greeting(content = "Hello $name!")
        logger.info(greeting.toUpperCase())
        return greetingRepository.save(greeting)
    }
}
