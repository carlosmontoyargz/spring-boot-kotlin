package com.example.springbootkotlin.repository

import com.example.springbootkotlin.domain.Greeting
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.concurrent.atomic.AtomicLong

@Repository
interface GreetingRepository : CrudRepository<Greeting, Int>
