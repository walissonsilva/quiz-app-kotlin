package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import kotlin.reflect.typeOf

class QuizQuestionsActivity : AppCompatActivity() {
    private val questionsList: ArrayList<Question> = Constants.getQuestions()
    private var questionIndex = 0;
    private val alternativesIds = arrayOf(R.id.optionOne, R.id.optionTwo, R.id.optionThree, R.id.optionFour)

    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null
    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var btnSubmit: Button? = null
    private var tvAlternatives: ArrayList<TextView>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgress)
        btnSubmit = findViewById(R.id.btnSubmit)
        tvAlternatives = arrayListOf(
            findViewById(R.id.optionOne),
            findViewById(R.id.optionTwo),
            findViewById(R.id.optionThree),
            findViewById(R.id.optionFour),
        )

        updateQuestion()

        btnSubmit?.setOnClickListener {
            if (questionIndex < questionsList.size - 1) {
                questionIndex++
                updateQuestion()
            }
        }



    }

    private fun updateQuestion() {
        // Render Question Text
        tvQuestion?.text = questionsList[questionIndex].questionText
        // Render Question Image
        ivImage?.setImageResource(questionsList[questionIndex].image)
        // progressBar
        progressBar?.progress = questionIndex + 1
        // Text of progress bar
        tvProgress?.text = "${questionIndex + 1}/${questionsList.size}"

        for (alternativeIndex in questionsList[questionIndex].alternatives.indices) {
            tvAlternatives!![alternativeIndex].text = questionsList[questionIndex].alternatives[alternativeIndex]
        }
    }
}