---
## Введение:
---
Обозначение    | Уровень важности
--------|-------------------------------------------------------------------------------
**(\*\*\*\*)**   | Без изучения этого материала невозможно успешное прохождение темы
**(\*\*\*)**     | Материал, без которого сложно успешно завершить изучение темы
**(\*\*)**       | Важный материал, рекомендуемый к изучению
**(\*)**         | Полезная литература, улучшающая навыки

---

---
## I. Основные принципы разработки. Git. Flow проектов
---
### Теоретическая часть

**1. ООП**
+ [Основные принципы](https://javarush.ru/groups/posts/principy-oop)  **(\*\*\*\*)**

**2. Работа с Git, gitflow**
+ [Видео-лекция Яндекса: Школа мобильной разработки – Git & Workflow. Дмитрий Складнов](https://www.youtube.com/watch?v=_TiUg1-SUzI) Лектор описывает что такое VCS, какие они бывают и пример workflow для работы с репозиторием **(\*\*\*)**
+ [Основные команды](https://git-scm.com/book/ru/v2) : init, clone, add, status, stash, commit (-m, -am, --amend), fetch, pull, push, branch, checkout, merge **(\*\*\*\*)**
+ Что такое [git flow](https://kb.simbirsoft.com/article/gitflow-method-overview/) **(\*\*\*)**
+ [Первоначальная настройка](https://git-scm.com/book/ru/v1/%D0%92%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%9F%D0%B5%D1%80%D0%B2%D0%BE%D0%BD%D0%B0%D1%87%D0%B0%D0%BB%D1%8C%D0%BD%D0%B0%D1%8F-%D0%BD%D0%B0%D1%81%D1%82%D1%80%D0%BE%D0%B9%D0%BA%D0%B0-Git): конфигурация username и email **(\*\*\*)**
+ [Изменение истории в git](https://git-scm.com/book/en/v2/Git-Tools-Rewriting-History). Почему это может быть [опасно](https://spin.atomicobject.com/2018/05/08/modify-git-history/)? **(\*\*\*)**
+ Опасность использования команды force и её альтернатива - [force-with-lease](https://blog.developer.atlassian.com/force-with-lease/), а также [возможные варианты решений](https://medium.com/@vitaliystanyshevskyy/git-push-origin-master-force-eec683936622) **(\*\*\*)**
+ История действий в git - [reflog](https://git-scm.com/docs/git-reflog) **(\*\*\*)**

**3. Создание проекта, среда разработки Android Studio**
+ [Установка Android Studio](https://developer.android.com/studio) **(\*\*\*\*)**
+ [Создание нового проекта](https://developer.android.com/training/basics/firstapp/index.html) **(\*\*\*\*)**
+ [Основы интерфейса Android Studio](https://developer.android.com/studio/intro/index.html) **(\*\*\*\*)**
+ [Горячие клавиши Android Studio](https://developer.android.com/studio/intro/keyboard-shortcuts) **(\*\*)**
+ [Горячие клавиши Android Studio, повышение производительности](https://habr.com/ru/post/359376/) **(\*\*\*)**

**4. Gradle**
+ [Gradle](https://developer.android.com/studio/build/index.html) **(\*\*\*)**

**5. Codelabs**
+ [Android Studio and Hello World](https://codelabs.developers.google.com/codelabs/android-training-hello-world/index.html?index=..%2F..index#0) **(\*\*)**


### Практическое задание
1. Склонировать репозиторий к себе на компьютер
2. В глобальных конфигурациях git прописать корректное имя пользователя и e-mail, которые будут использоваться для подписи коммитов.
3. Добавить `.gitignore`. Содержание файла можно взять с ресурса: https://www.gitignore.io/api/androidstudio. Cделать коммит и запушить изменения на remote-сервер в `master` ветку
4. Переключиться на новую ветку `develop`.
5. Создать новый android-проект (Phone and Tablet -> Empty Activity).
6. Добавить в gradle-файл библиотеку retrofit http://square.github.io/retrofit/
7. Запустить проект на симуляторе
8. Запустить проект на телефоне
8. Сделать коммит и запушить изменения на remote-сервер в `develop` ветку
10. Пройти все задания на ресурсе [LearnGitBranching](https://learngitbranching.js.org/?locale=ru_RU). Обратите внимание, что эта часть практического задания также обязательна к выполнению в полном объёме. 


---
## II. Java. Часть 1
---
### Теоретическая часть

**Основы**  
+ [Java-платформа](https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html) **(\*\*)**
+ [Типы данных и переменные](https://metanit.com/java/tutorial/2.1.php) **(\*\*\*\*)**
+ [Преобразования базовых типов данных](https://metanit.com/java/tutorial/2.2.php) **(\*\*\*\*)**
+ [Операции языка Java](https://metanit.com/java/tutorial/2.3.php) **(\*\*\*\*)**
+ [Массивы](https://metanit.com/java/tutorial/2.4.php) **(\*\*\*\*)**
+ [Условные конструкции](https://metanit.com/java/tutorial/2.5.php) **(\*\*\*\*)**
+ [Циклы](https://metanit.com/java/tutorial/2.6.php) **(\*\*\*\*)**
+ [Методы](https://metanit.com/java/tutorial/2.7.php) **(\*\*\*\*)**
+ [Рекурсивные функции](https://metanit.com/java/tutorial/2.8.php) **(\*\*\*)**
+ [Введение в обработку исключений](https://metanit.com/java/tutorial/2.10.php) **(\*\*)**
+ [Java Code Conventions - Oracle](http://www.oracle.com/technetwork/java/codeconventions-150003.pdf) **(\*\*\*\*)**
+ [Классы и объекты](https://metanit.com/java/tutorial/3.1.php)  **(\*\*\*\*)**
+ [Пакеты](https://metanit.com/java/tutorial/3.2.php)  **(\*\*\*\*)**
+ [Модификаторы доступа и инкапсуляция](https://metanit.com/java/tutorial/3.3.php)  **(\*\*\*\*)**
+ [Статические члены и модификатор static](https://metanit.com/java/tutorial/3.4.php)  **(\*\*\*\*)**
+ [Наследование, полиморфизм и ключевое слово super](https://metanit.com/java/tutorial/3.5.php)  **(\*\*\*\*)**
+ [Класс Object и его методы](https://habrahabr.ru/post/168195/)  **(\*\*\*)**
+ [Объекты как параметры методов](https://metanit.com/java/tutorial/3.14.php)  **(\*\*\*\*)**

**Отладка** 
+ [Android Studio Debugging: Базовые понятия](https://medium.com/@artem_shevchenko/android-studio-debugging-%D0%B1%D0%B0%D0%B7%D0%BE%D0%B2%D1%8B%D0%B5-%D0%BF%D0%BE%D0%BD%D1%8F%D1%82%D0%B8%D1%8F-%D0%B8-%D0%B2%D0%BE%D0%B7%D0%BC%D0%BE%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D0%B8-658ee6dcc641) **(\*\*\*)**
+ [Android Studio Debugging: Продвинутый уровень](https://medium.com/@artem_shevchenko/android-studio-debugging-%D0%BF%D1%80%D0%BE%D0%B4%D0%B2%D0%B8%D0%BD%D1%83%D1%82%D1%8B%D0%B9-%D1%83%D1%80%D0%BE%D0%B2%D0%B5%D0%BD%D1%8C-e05dac22439f) **(\*\*\*)**

### Практическое задание
Все задачи должны быть выполнены в указанном репозитории в отдельной ветке, вида training/lastname_firstname_date. После выполнения должен быть создан merge request на ментора.

***Важно! Весь код должен быть написан по предоставленному Java Code Conventions***

1. [Работа с примитивными типами](https://github.com/KatherineStrider/javacoreTraining/blob/master/app/src/main/java/com/example/user/javacoretraining/training/ElementaryTraining.java)
2. [Работа с массивами](https://github.com/KatherineStrider/javacoreTraining/blob/master/app/src/main/java/com/example/user/javacoretraining/training/ArraysTraining.java)

---
## III. Java. Часть 2
---
### Теоретическая часть

**1. Классы**
+ [Абстрактные классы](https://metanit.com/java/tutorial/3.6.php)  **(\*\*\*\*)**
+ [Иерархия наследования и преобразование типов](https://metanit.com/java/tutorial/3.10.php)  **(\*\*\*\*)**
+ [Внутренние классы](https://metanit.com/java/tutorial/3.12.php)  **(\*\*\*\*)**
+ [Интерфейсы](https://metanit.com/java/tutorial/3.7.php)  **(\*\*\*\*)**
+ [Интерфейсы в механизме обратного вызова](https://metanit.com/java/tutorial/3.16.php)  **(\*\*\*)**
+ [Перечисления enum](https://metanit.com/java/tutorial/3.8.php)  **(\*\*\*\*)**
+ [Обобщенные типы и методы](https://metanit.com/java/tutorial/3.11.php)  **(\*\*\*)**
+ [Наследование и обобщения](https://metanit.com/java/tutorial/3.15.php)  **(\*\*\*)**
+ [Типы ссылок](https://javadevblog.com/tipy-ssy-lok-v-java-strongreference-weakreference-softreference-i-phantomreference.html)  **(\*\*\*)**
+ [Ссылочные типы и клонирование объектов](https://metanit.com/java/tutorial/3.13.php) **(\*\*\*)**

**2. Обработка исключений**  
+ [Оператор throws](https://metanit.com/java/tutorial/4.1.php) **(\*\*\*\*)**
+ [Классы исключений](https://metanit.com/java/tutorial/4.2.php) **(\*\*\*\*)**
+ [try-with-resources](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html) **(\*\*\*\*)**
+ [Создание своих классов исключений](https://metanit.com/java/tutorial/4.3.php) **(\*\*)**

**3. Коллекции**  
+ [Введение в коллекции в Java](https://metanit.com/java/tutorial/5.1.php) **(\*\*\*\*)**
+ [Класс ArrayList и интерфейс List](https://metanit.com/java/tutorial/5.2.php) **(\*\*\*\*)**
+ [Структуры данных в картинках. ArrayList](https://habr.com/en/post/128269/) **(\*\*\*\*)**
+ [Класс LinkedList](https://metanit.com/java/tutorial/5.3.php) **(\*\*)**
+ [Структуры данных в картинках. LinkedList](https://habr.com/en/post/127864/) **(\*\*)**
+ [Класс HashSet](https://metanit.com/java/tutorial/5.4.php) **(\*\*\*\*)**
+ [Класс TreeSet](https://metanit.com/java/tutorial/5.5.php) **(\*\*\*)**
+ [Интерфейсы Comparable и Comporator. Сортировка](https://metanit.com/java/tutorial/5.6.php) **(\*\*\*)**
+ [Очереди и класс ArrayDeque](https://metanit.com/java/tutorial/5.7.php) **(\*\*)**
+ [Отображения и класс HashMap](https://metanit.com/java/tutorial/5.8.php) **(\*\*\*\*)**
+ [Структуры данных в картинках. HashMap](https://habr.com/en/post/128017/) **(\*\*\*\*)**
+ [Класс TreeMap](https://metanit.com/java/tutorial/5.9.php) **(\*\*)**
+ [Итераторы](https://metanit.com/java/tutorial/5.10.php) **(\*\*)**
+ [SparseArray](https://developer.android.com/reference/android/util/SparseArray?hl=ru) **(\*\*)**
+ [ArrayMap](https://developer.android.com/reference/android/util/ArrayMap?hl=ru) **(\*\*)**
+ [ArrayMap&SparseArray](https://android.jlelse.eu/app-optimization-with-arraymap-sparsearray-in-android-c0b7de22541a) **(\*\*)**

**4. Работа со строками**  
+ [Введение в строки. Класс String](https://metanit.com/java/tutorial/7.1.php) **(\*\*\*\*)**
+ [Основные операции со строками](https://metanit.com/java/tutorial/7.2.php) **(\*\*\*\*)**
+ [StringBuffer и StringBuilder](https://metanit.com/java/tutorial/7.3.php) **(\*\*\*)**
+ [Регулярные выражения](https://metanit.com/java/tutorial/7.4.php) **(\*\*)**

**5. Лямбда-выражения**  
+ [Введение в лямбда-выражения](https://metanit.com/java/tutorial/9.1.php) **(\*\*\*\*)**
+ [Лямбды как параметры методов и ссылки на методы](https://metanit.com/java/tutorial/9.2.php) **(\*\*\*\*)**
+ [Встроенные функциональные интерфейсы](https://metanit.com/java/tutorial/9.3.php) **(\*\*)**
  
  
### Базовое задание
Все задачи должны быть выполнены в указанном репозитории в отдельной ветке, вида training/lastname_firstname_date. После выполнения должен быть создан merge request на ментора.

1. [Работа со списками](http://gitlab.simbirsoft/mobile/javacoreTraining/blob/master/app/src/main/java/com/example/user/javacoretraining/collections/CollectionsBlock.java)
2. [Работа с классами](http://gitlab.simbirsoft/mobile/javacoreTraining/blob/master/app/src/main/java/com/example/user/javacoretraining/classes/ClassesBlock.java)
3. [Работа со строками](http://gitlab.simbirsoft/mobile/javacoreTraining/blob/master/app/src/main/java/com/example/user/javacoretraining/training/StringsTraining.java)


### Практическое задание
Все задачи должны быть реализованы в одном файле и разделены комментариями, указывающими на номер или текст задания.

**Важно! Весь код должен быть написан по предоставленному Java Code Conventions**
1. Настроить проект для [java 8](https://developer.android.com/studio/write/java8-support.html?utm_source=android-studio)
2. Написать простое лямбда-выражение в переменной `myClosure`, лямбда-выражение должно выводить в консоль фразу "I love Java". Вызвать это лямбда-выражение. Далее написать функцию, которая будет запускать заданное лямбда-выражение заданное количество раз. Объявить функцию так: `public void repeatTask (int times, Runnable task)`. Функция должна запускать `times` раз лямбда-выражение `task` . Используйте эту функцию для печати "I love Java" 10 раз.
3. Условия: есть начальная позиция на двумерной плоскости, можно осуществлять последовательность шагов по четырем направлениям up, down, left, right. Размерность каждого шага равна 1. Задание: 
  - Создать enum `Directions` с возможными направлениями движения
  - Создать метод, принимающий координаты и одно из направлений и возвращающий координаты после перехода по направлению
  - Создать метод, осуществляющий несколько переходов от первоначальных координат и выводящий координаты после каждого перехода. Для этого внутри метода следует определить переменную `location` с начальными координатами (0,0) и  массив направлений, содержащий элементы [up, up, left, down, left, down, down, right, right, down, right], и програмно вычислить какие будут координаты у переменной `location` после выполнения этой последовательности шагов. Для вычисленеия результата каждого перемещения следует использовать созданный ранее метод перемещения на один шаг.
4. Создать интерфейс Shape с двумя методами perimeter и area, выводящими периметр и площадь фигуры соответственно, после чего реализовать и использовать для вывода периметра и площади следующие классы, реализующие интерфейс Shape:
  - `Rectangle` - прямоугольник с двумя свойствами: ширина и длина
  - `Square` - квадрат с одним свойством: длина стороны
  - `Circle` - круг с одним свойством: диаметр круга
