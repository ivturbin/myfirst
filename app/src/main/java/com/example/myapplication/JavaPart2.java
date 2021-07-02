package com.example.myapplication;

import android.util.Log;

public class JavaPart2 {
    static final String DIVIDER = "-----------------------------------------------------------------------";
    public void doIt() {
        LambdaClass lambdaClass = new LambdaClass();
        lambdaClass.test();
        Movings movings = new Movings();
        movings.test();
        Shapes shapes = new Shapes();
        shapes.test();
    }
    /**
     * Написать простое лямбда-выражение в переменной myClosure, лямбда-выражение должно выводить
     * в консоль фразу "I love Java". Вызвать это лямбда-выражение. Далее написать функцию,
     * которая будет запускать заданное лямбда-выражение заданное количество раз.
     * Объявить функцию так: public void repeatTask (int times, Runnable task).
     * Функция должна запускать times раз лямбда-выражение task .
     * Используйте эту функцию для печати "I love Java" 10 раз.
     */
    class LambdaClass {
        private static final String TAG = "LAMBDA";
        private static final String LOVE = "I Love Java";

        Runnable myClosure = () -> Log.i(TAG, LOVE);

        public void test() {
            Log.i(TAG, DIVIDER);
            repeatTask(10,myClosure);
        }
        void repeatTask (int times, Runnable task) {
            while (times-- != 0) {
                task.run();
            }
        }
    }

    /**
     * Условия: есть начальная позиция на двумерной плоскости, можно осуществлять
     * последовательность шагов по четырем направлениям up, down, left, right.
     * Размерность каждого шага равна 1. Задание:
     *Создать enum Directions с возможными направлениями движения
     *Создать метод, принимающий координаты и одно из направлений и возвращающий координаты
     *после перехода по направлению
     *Создать метод, осуществляющий несколько переходов от первоначальных координат
     *и выводящий координаты после каждого перехода.
     *Для этого внутри метода следует определить переменную location с начальными координатами (0,0)
     *и массив направлений, содержащий элементы
     *[up, up, left, down, left, down, down, right, right, down, right],
     *и програмно вычислить какие будут координаты у переменной location после выполнения
     *этой последовательности шагов. Для вычисленеия результата каждого перемещения следует
     *использовать созданный ранее метод перемещения на один шаг.
     */
    static class Movings {
        private static final String TAG = "MOVINGS";
        void test() {

            Log.i(TAG, DIVIDER);
            Point location = new Point(0, 0);
            Directions[] directions = {Directions.UP, Directions.UP, Directions.LEFT,
                    Directions.DOWN, Directions.LEFT, Directions.DOWN,
                    Directions.DOWN, Directions.RIGHT, Directions.RIGHT,
                    Directions.DOWN, Directions.RIGHT};

            for (Directions direction : directions) {
                location.move(direction);
                location.show();
            }
        }
        enum Directions {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }
        class Point {
            private static final String TAG = "POINT";
            private int x;
            private int y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public void move(Directions direction) {
                switch (direction) {
                    case UP:
                        y += 1;
                        break;
                    case DOWN:
                        y -= 1;
                        break;
                    case LEFT:
                        x -= 1;
                        break;
                    case RIGHT:
                        x += 1;
                        break;
                }
            }

            public void show() {
                Log.i(TAG, "(" + x + ", " + y + ")");
            }
        }
    }

    /**
     * Создать интерфейс Shape с двумя методами perimeter и area, выводящими периметр
     * и площадь фигуры соответственно, после чего реализовать и использовать для вывода периметра
     * и площади следующие классы, реализующие интерфейс Shape:
     * Rectangle - прямоугольник с двумя свойствами: ширина и длина
     * Square - квадрат с одним свойством: длина стороны
     * Circle - круг с одним свойством: диаметр круга
     */
    class Shapes {
        private static final String TAG = "SHAPES";
        void test() {
            Log.i(TAG, DIVIDER);
            Rectangle rectangle = new Rectangle(5, 2);
            Log.i(TAG,  String.format("Rectangle's area: %.2f, perimeter: %.2f",rectangle.area(), rectangle.perimeter()));
            Square square = new Square(4);
            Log.i(TAG, String.format("Square's area: %.2f, perimeter: %.2f",square.area(), square.perimeter()));
            Circle circle = new Circle(8);
            Log.i(TAG, String.format("Circle's area: %.2f, perimeter: %.2f", circle.area(), circle.perimeter()));
        }
    }

    interface Shape {
        public double perimeter();
        public double area();
    }

    class Rectangle implements Shape {
        private final double length;
        private final double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double perimeter() {
            return length + length + width + width;
        }

        @Override
        public double area() {
            return length*width;
        }

    }
    class Square implements Shape {
        private final double side;

        Square(double side) {
            this.side = side;
        }

        @Override
        public double perimeter() {
            return side + side + side + side;
        }

        @Override
        public double area() {
            return side * side;
        }
    }
    class Circle implements Shape {
        private static final double PERIMETER_FORMULA = 2 * Math.PI;
        private final double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double perimeter() {
            return radius * PERIMETER_FORMULA;
        }

        @Override
        public double area() {
            return Math.PI * Math.pow(radius, 2);
        }
    }
}
