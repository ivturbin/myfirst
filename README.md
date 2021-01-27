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
