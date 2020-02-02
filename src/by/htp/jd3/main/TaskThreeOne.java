package by.htp.jd3.main;

public class TaskThreeOne {
    public static void main(String[] args) {
        getTaskOne();
        getTaskTwo();
        getTaskThree();
        getTaskFour();
        getTaskFive();
        getTaskSix(8);
        getTaskSeven();
        getTaskEight();
        getTaskNine();
        getTaskTen();
        getTaskEleven();
        getTaskTwelve();
        getTaskThirteen();
        getTaskFourteen(3);
        getTaskFifteen();
    }

    /**
     * 1. Необходимо вывести на экран числа от 1 до 5.
     */
    private static void getTaskOne() {
        for (int i = 0; i < 6; i++) {

            System.out.println(" Число " + i + ", ");
        }
    }

    /**
     * 2. Необходимо вывести на экран числа от 5 до 1.
     */
    private static void getTaskTwo() {
        int i;
        i = 5;

        do {
            System.out.println(" Число " + i + ", ");
            i--;
        } while (i >= 0);
    }

    /**
     * 3. Необходимо вывести на экран таблицу умножения на 3.
     */
    private static void getTaskThree() {
        int i;

        i = 1;

        do {
            System.out.println(" Число 3 * " + i + " = " + 3 * i);
            i++;
        } while (i <= 10);
    }

    /**
     * 4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
     * включительно.
     */
    private static void getTaskFour() {
        int i;
        i = 2;
        while (i <= 100) {
            System.out.print(" Четное число " + i + ", ");
            i = i + 2;
        }
    }

    /**
     * 5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в
     * диапазоне от 1 до 99 включительно.
     */
    private static void getTaskFive() {
        int i;
        int b;
        b = 0;
        i = 1;
        while (i <= 99) {
            b += i;

            i = i + 2;
        }
        System.out.print("Сумма нечетных чисел " + b);
    }

    /**
     * 6. Напишите программу, где пользователь вводит любое целое положительное число. А программа
     * суммирует все числа от 1 до введенного пользователем числа
     */
    private static void getTaskSix(int a) {
        if (a > 0) {

            int i;
            i = 0;

            while (i <= a) {
                System.out.print(" Четное число " + i + ", ");
                i++;
            }
        } else {
            System.out.print("Введенное число не четное");
        }
    }

    /**
     * 7. Вычислить значения функции на отрезке [а,b] c шагом h:
     */
    private static void getTaskSeven() {
        double y;
        double x;
        double h;
        double a;
        double b;

        a = 0;
        b = 5;
        h = 0.5;

        for (x = a; x <= b - h; x += h) {
            System.out.print("x= " + x + ",");

            if (x > 2) {

                y = x;
                System.out.println("y =" + y);
            } else if (x <= 0) {

                y = -x;
                System.out.println("y =" + y);
            }
        }
    }

    /**
     * 8. Вычислить значения функции на отрезке [а,b] c шагом h:
     */
    private static void getTaskEight() {
        double y;
        double x;
        double h;
        double a;
        double b;
        double c;

        a = 0;
        c = 1;
        b = 5;
        h = 0.5;
        for (x = a; x <= b - h; x += h) {
            System.out.print("x= " + x + ",");

            if (x == 15) {

                y = (x + c) * 2;
                System.out.println("y =" + y);

            } else if (x != 15) {

                y = (x - c) + 6;
                System.out.println("y =" + y);
            }
        }
    }

    /**
     * 9. Найти сумму квадратов первых ста чисел.
     */
    private static void getTaskNine() {
        long i;
        long y;
        y = 0;
        i = 0;

        while (i <= 100) {
            y += i * i;
            i++;
        }
        System.out.print("Сумма квадратов первых ста чисел " + y);
    }

    /**
     * 10. Составить программу нахождения произведения квадратов первых двухсот чисел.
     */
    private static void getTaskTen() {
        double i;
        double y;
        y = 1;
        i = 1;

        while (i <= 200) {
            y *= (i * i);
            i++;
        }
        System.out.print("Произведение квадратов первых двухста чисел " + y);
    }

    /**
     * 11. Составить программу нахождения разности кубов первых двухсот чисел
     */
    private static void getTaskEleven() {
        double i;
        double y;
        y = 0;
        i = 0;

        while (i <= 200) {
            y -= (i * i);
            i++;
        }
        System.out.print("Разности кубов первых двухсот чисел " + y);
    }

    /**
     * 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
     * нахождения произведения первых 10 членов этой последовательности.
     */
    private static void getTaskTwelve() {
        int i = 0;
        int a;
        int b;
        b = 1;
        while (i <= 10) {

            a = 6 + b;

            b = a;

            System.out.print("Разности кубов первых двухсот чисел " + b + " , ");

            i++;
        }
    }

    /**
     * 13. Составить таблицу значений функции y = 5 - x 2/2 на отрезке [-5; 5] с шагом 0.5
     */
    private static void getTaskThirteen() {
        double y;
        double x;
        double h;
        double a;
        double b;

        a = -5;
        b = 5;
        h = 0.5;
        for (x = a; x <= b - h; x += h) {
            System.out.print("x= " + x + ",");
            y = 5 - (Math.pow(x, 2) / 2);
            System.out.println("y =" + y);
        }
    }

    /**
     * 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
     */
    private static void getTaskFourteen(double a) {

        double i;
        double y;
        y = 0;

        for (i = 1; i <= a; i++) {
            y += 1 / i;
            System.out.println("Натуральное y =" + y);
        }
    }

    /**
     * 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени
     */
    private static void getTaskFifteen() {
        double i;
        double y;
        y = 0;

        for (i = 1; i <= 10; i++) {
            y = Math.pow(2, i) - 1;
            System.out.println("Число y =" + y);
        }
    }
}
