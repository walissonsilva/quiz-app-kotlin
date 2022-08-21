package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            arrayListOf("Argentina", "Australia", "Armenia", "Austria"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            arrayListOf("Angola", "Austria",
            "Australia", "Armenia"),
            3
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            arrayListOf("Belarus", "Belize",
            "Brunei", "Brazil"),
            4
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            arrayListOf("Bahamas", "Belgium",
            "Barbados", "Belize"),
            2
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            arrayListOf("Gabon", "France",
            "Fiji", "Finland"),
            3
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            arrayListOf("Germany", "Georgia",
            "Greece", "none of these"),
            1
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            arrayListOf("Dominica", "Egypt",
            "Denmark", "Ethiopia"),
            3
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            arrayListOf("Ireland", "Iran",
            "Hungary", "India"),
            4
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            arrayListOf("Australia", "New Zealand",
            "Tuvalu", "United States of America"),
            2
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Kuwait", "Jordan",
            "Sudan", "Palestine"),
            1
        )
        questionsList.add(questionTen)

        return questionsList
    }
}