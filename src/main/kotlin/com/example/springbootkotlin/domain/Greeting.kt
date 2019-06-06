package com.example.springbootkotlin.domain

import javax.persistence.*

@Entity
class Greeting
(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,

    @Column(nullable = false)
    val content: String
)
{
    fun toUpperCase() = content.toUpperCase()
}
