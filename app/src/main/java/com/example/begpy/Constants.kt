package com.example.begpy

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Что делает функия print?",
            "Выводит текст",
            "Позволяет ввести текст",
            "Такой функции не существует",
            "Математическая функция",
            1
        )
        questionsList.add(question1)

        val question2 = Question(
            1,
            "Какой тип данных существует в Python?",
            "var",
            "float",
            "double",
            "XD",
            2

        )
        questionsList.add(question2)

        val question3 = Question(
            1,"Какой тип данных получится в результате деления?" +
                    "print(1 / 2)",
            "int",
            "str",
            "float",
            "Syntax Error",
            3
        )

        questionsList.add(question3)

        val question4 = Question(
            1,
            "Как правильно создать функцию в Python?",
            "create myFunction():",
            "function myfunction():",
            "def myFunction():",
            "Все варианты неверны",
            3
        )
        questionsList.add(question4)

        val question5 = Question(
            1,
            "Каким является язык Python?",
            "Объектно-ориентированным",
            "Машинным",
            "Алгоритмическим",
            "Логическим",
            1
        )
        questionsList.add(question5)

        val question6 = Question(
            1,
            "Как в Python обозначается комментарий?",
            "//",
            "/*",
            "///",
            "#",
            4
        )
        questionsList.add(question6)

        val question7 = Question(
            1,
            "Как обозначается многострочный коментарий в Python?",
            "/.",
            "<<>>",
            "Тройные кавычки",
            "||",
            3
        )
        questionsList.add(question7)

        val question8 = Question(
            1,
            "Каков правильный синтаксис для вывода \"Hello World\" в Python?",
            "echo(\"Hello World\")",
            "print(\"Hello World\")",
            "p(\"Hello World\")",
            "echo \"Hello World\"",
            2
        )
        questionsList.add(question8)

        val question9 = Question(
            1,
            "Как правильно обозначить переменную?",
            "x = int(5)",
            "x = 5",
            "x == 5",
            "Все варианты верны",
            2
        )
        questionsList.add(question9)

        val question10 = Question(
            1,
            "Каково правильное расширение файла для файлов Python?",
            ".pt",
            ".py",
            ".pyth",
            ".p",
            2
        )
        questionsList.add(question10)
        return questionsList
    }
}