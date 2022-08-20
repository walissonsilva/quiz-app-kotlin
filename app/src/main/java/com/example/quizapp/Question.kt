package com.example.quizapp

data class Question(
    val id: Int,
    val questionText: String,
    val image: Int,
    val alternatives: Array<String>,
    val correctAnswerIndex: Int,
)
