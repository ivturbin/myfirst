package com.example.myapplication

import android.util.Log

/**
 *Необходимо создать интерфейс Publication,
 * у которого должно быть свойства – price и wordCount, а также метод getType, возвращающий строку.
 * Создать два класса, реализующих данный интерфейс – Book и Magazine.
 * В методе getType для класса Book возвращаем строку с зависимости от количества слов.
 * Если количество слов не превышает 1000, то вывести “Flash Fiction”,
 * 7,500 –“Short Story”, всё, что выше – “Novel”.
 * Для класса Magazine возвращаем строку “Magazine”.
 * */

interface Publication {
    val price: Int
    val wordCount: Int

    fun getType(): String
}


class Book(override val price: Int, override val wordCount: Int) : Publication {
    override fun getType(): String {
        return when (wordCount) {
            in Size.SHORT.range -> Size.SHORT.type
            in Size.MEDIUM.range -> Size.MEDIUM.type
            in Size.BIG.range -> Size.BIG.type
            else -> "none"
        }
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    enum class Size(val range: IntRange, val type: String) {
        SHORT(0..1000, "FlashFiction"),
        MEDIUM(1001..7500, "Short Story"),
        BIG(7501..Int.MAX_VALUE, "Novel")
    }
}


class Magazine(override val price: Int, override val wordCount: Int) : Publication {
    override fun getType(): String {
        return "Magazine"
    }
}


class Practice {

    /**
     * Создать два объекта класса Book и один объект Magazine.
     * Вывести в лог для каждого объекта тип, количество строк и цену в евро в отформатированном виде.
     * У класса Book переопределить метод equals и произвести сравнение сначала по ссылке,
     * затем используя метод equals.
     * Результаты сравнений вывести в лог.
     * */

    fun secondTask() {
        val book1 = Book(100, 1200)
        val book2 = Book(150, 8000)
        val magazine = Magazine(20, 400)
        val TAG: String = "PUBLICATION"

        Log.i(TAG, String.format("Тип книги: %-12s, количество слов: %-5d, цена: %-3d €", book1.getType(), book1.wordCount, book1.price))
        Log.i(TAG, String.format("Тип книги: %-12s, количество слов: %-5d, цена: %-3d €", book2.getType(), book2.wordCount, book2.price))
        Log.i(TAG, String.format("Тип книги: %-12s, количество слов: %-5d, цена: %-3d €", magazine.getType(), magazine.wordCount, magazine.price))
        Log.i(TAG, "сравнение по ссылке: " + (book1 === book2).toString())
        Log.i(TAG, "сравнение equals:    " + (book1 == book2).toString())
    }

    /**
     * Создать метод buy, который в качестве параметра принимает Publication (notnull - значения)
     * и выводит в лог “The purchase is complete.
     * The purchase amount was [цена издания]”. Создать две переменных класса Book,
     * в которых могут находиться null значения. Присвоить одной null,
     * а второй любое notnull значение и вызвать метод buy с каждой из переменных.
     * */

    fun thirdTask() {
        val book1: Book? = null
        val book2: Book? = Book(150, 8000)

        buy(book1)
        buy(book2)
    }

    private fun buy(publication: Publication?) {
        val TAG: String = "PURCHASE"

        if (publication != null) {
            Log.i(TAG, "The purchase is complete. The purchase amount was " + publication.price)
        } else {
            Log.i(TAG, "There is no purchase")
        }
    }

    /**
     * Создать переменную sum и присвоить ей лямбда-выражение,
     * которое будет складывать два переданных ей числа и выводить результат в лог.
     * Вызвать данное лямбда-выражение с произвольными параметрами.
     * */

    fun fourthTask() {
        val TAG: String = "LAMBDA"
        val sum = { a: Int, b: Int -> Log.i(TAG, (a + b).toString()) }
        sum(5, 8)
    }
}