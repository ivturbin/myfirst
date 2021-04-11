package com.example.myapplication

import android.util.Log
import java.lang.IllegalArgumentException
import java.util.*

/**
 * 1. Создать enum Type с константами DEMO и FULL.
 * */

enum class Type {
    DEMO, FULL
}

/**
 * 2. Реализовать класс данных User с полями id, name, age и type.
 * У класса User создать ленивое свойство startTime, в котором получаем текущее время.
 * */

data class User(val id: Int, val name: String, var age: Int = 0, var type: Type = Type.DEMO) {
    val startTime: Calendar by lazy {
        Calendar.getInstance()
    }
}


class Practice2 {
    val TAG = "KOTLIN2"

    /**
     * 3. Создать объект класса User, вывести в лог startTime данного юзера,
     * после вызвать Thread.sleep(1000) и повторно вывести в лог startTime.
     * */

    fun lazyStartTime() {
        val user = User(1, "1", 1, Type.DEMO)
        Log.i("startTime", user.startTime.timeInMillis.toString())
        Thread.sleep(1000)
        Log.i("startTime", user.startTime.timeInMillis.toString())
    }

    /**
     * 4. Создать список пользователей, содержащий в себе один объект класса User.
     * Используя функцию apply, добавить ещё несколько объектов класса User в список пользователей.
     * */

    private fun getUsers(): MutableList<User> {
        val users = mutableListOf(User(1, "Ivan", 17, Type.FULL))

        users.apply { add(User(2, "Adam", age = 120, type = Type.DEMO))
            add(User(3, "George", age = 121, type = Type.FULL))
            add(User(2, "Chups")) }

        return users
    }

    /**
     * 5. Получить список пользователей, у которых имеется полный доступ
     * (поле type имеет значение FULL)
     * */

    private fun getFullUsers(): List<User> {
        return getUsers().filter { it.type == Type.FULL }
    }

    /**
     * 6. Преобразовать список User в список имен пользователей.
     * Получить первый и последний элементы списка и вывести их в лог.
     * */

    fun extremeFullUsers() {
        val names = getFullUsers().map { user -> user.name }
        Log.i(TAG, "First user is " + names.first())
        Log.i(TAG, "Second user is " + names.last())
    }

    /**
     * 7. Создать функцию-расширение класса User,
     * которая проверяет, что юзер старше 18 лет,
     * и в случае успеха выводит в лог, а в случае неуспеха возвращает ошибку.
     * */

    private fun User.checkAge() {
        if (this.age < 18) {
            throw TooYoungException("$name is too young")
        }
        Log.i(TAG, "$name is adult.")
    }

    /**
     *
     * 8. Создать интерфейс AuthCallback с методами authSuccess, authFailed
     * и реализовать анонимный объект данного интерфейса.
     * В методах необходимо вывести в лог информацию о статусе авторизации.
     * */

    interface AuthCallback {
        fun authSuccess()
        fun authFailed()
    }

    private fun getAuthCallBack(): AuthCallback {
        return object : AuthCallback {
            override fun authSuccess() {
                Log.i(TAG, "Authorization succeeded")
            }

            override fun authFailed() {
                Log.i(TAG, "Authorization failed")
            }
        }
    }

    /**
     * 9. Реализовать inline функцию auth, принимающую в качестве параметра функцию updateCache.
     * Функция updateCache должна выводить в лог информацию об обновлении кэша.
     * 10. Внутри функции auth вызвать метод коллбека authSuccess и переданный updateCache,
     * если проверка возраста пользователя произошла без ошибки.
     * В случае получения ошибки вызвать authFailed
     * */

    private fun updateCache() {
        Log.i(TAG, "Cache updated")
    }

    private inline fun auth(user: User, action: () -> Unit) {
        try {
            user.checkAge()
            action()
            getAuthCallBack().authSuccess()
        } catch (e: TooYoungException) {
            getAuthCallBack().authFailed()
        }
    }

    /**
     * 11. Реализовать изолированный класс Action
     * и его наследников – Registration, Login и Logout.
     * Login должен принимать в качестве параметра экземпляр класса User.
     * 12. Реализовать метод doAction, принимающий экземпляр класса Action.
     * В зависимости от переданного действия выводить в лог текст, к примеру “Auth started”.
     * Для действия Login вызывать метод auth.
     */

    private fun doAction(action: Action) {
        when (action) {
            is Registration -> Log.i(TAG, "Registration")
            is Login -> auth(action.user) { updateCache() }
            is Logout -> Log.i(TAG, "Logout")
        }
    }

    fun doActionTest() {
        doAction(Registration())
        doAction(Login(getFullUsers()[0]))
        doAction(Login(getFullUsers()[1]))
        doAction(Login(getUsers()[1]))
    }
}


class TooYoungException(message: String) : IllegalArgumentException(message)


sealed class Action
class Registration : Action()
class Login(val user: User) : Action()
class Logout : Action()
