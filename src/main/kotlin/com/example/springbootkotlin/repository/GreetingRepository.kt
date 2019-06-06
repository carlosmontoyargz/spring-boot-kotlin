package com.example.springbootkotlin.repository

import com.example.springbootkotlin.domain.Greeting
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GreetingRepository : CrudRepository<Greeting, Int>
