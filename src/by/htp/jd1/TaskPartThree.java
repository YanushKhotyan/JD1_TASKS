package by.htp.jd1;

public class TaskPartThree {

    public static void main(String[] args) {
        getTaskTwentySix(5.0, 6.0, 45);
        getTaskTwentySeven(2.0);
        getTaskTwentyEight(1.0);
        getTaskTwentyNine(4.0, 5.0, 6.0);
        getTaskThirty(4.0, 5.0, 6.0);
        getTaskThirtyOne(4.0, 5.0, 6.0, 3.0);
        getTaskThirtyTwo(10, 45, 0, 10, 50, 50);
        getTaskThirtyThree('W');
        getTaskThirtyFour(32);
        getTaskThirtyFive(150.20, 17.09);
        getTaskThirtySix(3245);
        System.out.println("Task 37");

        getExampleOne(44);
        getExampleTwo(2222);
        getExampleThree(222);
        getExampleFour(6, 3, 8);
        getExampleFive(189);
        getExampleSix(3, 4, 3);
        getExampleSeven(123);
        getExampleEight(2, 2);
        getExampleNine(3, 4, 4, 2, 2);

        getTaskThirtyEight(4, 4);
        getTaskThirtyNine();
        getTaskForty();

    }

    /**
     * 26. Найти площадь треугольника, две стороны которого равны а и b, а угол
     * между стими сторонами у.
     */
    public static void getTaskTwentySix(double a, double b, double y) {

        double s = 0;

        if (y > 0 && y < 360.0) {

            s = a * b * Math.cos(Math.PI * y / 180);

            System.out.println("Площадь равна " + s);

        } else {
            System.out.println("Уcловис заданы неправильно ");
        }
    }

    /**
     * 27. Дано значение a. се использус никаких функций и никаких операций, кроме
     * умноженис, получить значение а8 за три операции и а10 за четыре операции.
     */
    private static void getTaskTwentySeven(double a) {

        double b = (a * a * a) * (a * a * a) * (a * a * a) * a;

        double c = (a * a * a) * (a * a * a) * (a * a);

        System.out.println("A во воcьмой степени ранвно " + c + ", " + "A в деcстой степени равно " + b);
    }

    /**
     * 28. Составить программу перевода радианной меры угла в градусы, минуты и
     * секунды.
     */
    private static void getTaskTwentyEight(double a) {

        double gr = a * 180 / Math.PI;

        double min = a * (60 * 180) / Math.PI;

        double sec = a * ((3600 * 180) / Math.PI);

        System.out
                .println("Перевод радианной меры угла в градуcы " + gr + ", " + "Перевод радианной меры угла в минуты "
                        + min + ", " + "Перевод радианной меры угла в cекунды " + sec);
    }

    /**
     * 29. сайти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
     */
    private static void getTaskTwentyNine(double a, double b, double c) {

        double alfa, beta, gamma;

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {

            alfa = Math.cos(-(a * a - b * b - c * c) / (2 * b * c));

            beta = Math.cos(-(b * b - a * a - c * c) / (2 * a * c));

            gamma = Math.cos(-(c * c - a * a - b * b) / (2 * a * b));

            System.out.println("Угол альфа в радианах: " + alfa + ", " + "Угол Бета в радианах: " + beta + ", "
                    + "Угол гамма в радианах: " + gamma);
        }
    }

    /**
     * 30. Три сопротивленис R1 R2, и R3 соединены параллельно. сайдите
     * сопротивление соединенис.
     */
    private static void getTaskThirty(double r1, double r2, double r3) {

        double x = 1 / ((1 / r1) + (1 / r2) + (1 / r3));

        System.out.println("Cопротивление соединенис: " + x);
    }

    /**
     * 31. Составить программу длс вычисленис пути, пройденного лодкой, если ее
     * скорость в стосчей воде v км/ч, скорость теченис реки v1 км/ч, времс движенис
     * по озеру t1 ч, а против теченис реки — t2 ч.
     */
    private static void getTaskThirtyOne(double t1, double v, double t2, double v1) {

        double s = t1 * v + t2 * (v - v1);

        System.out.println("Путь пройденный лодкой: " + s);
    }

    /**
     * 32. Текущее показание слектронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к
     * с (0 ≤к ≤59). Какое времс будут показывать часы через р ч q мин r с?
     */
    private static void getTaskThirtyTwo(int m, int n, int k, int p, int q, int r) {

        int newc = m + p;
        int newm = 0;
        int news = 0;
        if (n + q >= 60) {
            newc = newc + (n + q) / 60;
            newm = (n + q) % 60;
        } else if (k + r >= 60) {
            newm = newm + (k + r) / 60;
            news = (n + q) % 60;
        } else if (newc >= 24) {
            while (newm >= 24) {
                newc = newc - 24;
            }
        }
        System.out.println("Часы покажут " + newc + "ч. " + newm + "мин. " + news + " с.");
    }

    /**
     * 33. Ввести любой символ и определить его порсдковый номер, а также указать
     * предыдущий и последующий символы.
     */
    public static void getTaskThirtyThree(char a) {
        int b = (int) a;
        int c = (char) (b - 1);

        char e = (char) c;
        int d = (char) (b + 1);

        char f = (char) d;
        System.out.println("Example one: " + b + " , Example two: " + e + " , Example three: " + f);
    }

    /**
     * 34. Дана величина с, выражающас объем информации в байтах. Перевести с в
     * более крупные единицы измеренис информации.
     */
    private static void getTaskThirtyFour(double a) {

        double b = a / 1024;

        double c = (a / 1024) / 1024;

        double d = ((a / 1024) / 1024) / 1024;

        System.out.println("  объем информации в килобайтах: " + b + ", " + " объем информации в мегабайтах: " + c
                + ", " + " объем информации в мегабайтах: " + d);
    }

    /**
     * 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и
     * младшую цифру целой части числа M/N.
     */
    private static void getTaskThirtyFive(double m, double n) {

        double x = m / n;

        int c = (int) (10 * x) % 10;
        int b = (int) x % 10;

        System.out.println("Старшас цифра дробной части: " + c + ", " + " Младшас цифра целой части: " + b);
    }

    /**
     * 36. сайти частное произведений четных и нечетных цифр четырехзначного числа.
     */
    public static void getTaskThirtySix(int a) {
        int sumOdd = 0;

        int sumEven = 0;

        for (int i = 1; i < 5; i++) {
            int d = a % 10;
            a /= 10;
            if (i % 2 == 0) {
                sumEven *= d;
            } else {
                sumOdd *= d;
            }
        }
        System.out.println("Произведение cуммы четных и нечетных цифр " + sumEven * sumOdd);
    }

    /**
     * 37. Составить линейную программу, печатающую значение true, если указанное
     * высказывание свлсетсс истинным, и false — в противном случае:
     */

    /**
     * Целое число N свлсетсс четным двузначным числом.
     */
    private static void getExampleOne(int a) {
        if (a % 2 == 0 && a > 0 && a < 100) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
     * последних цифр.
     */
    private static void getExampleTwo(int n) {
        int a, b, c, d;

        a = n / 1000;

        b = n / 100 % 10;

        c = n % 100 / 10;

        d = n % 1000 % 10;

        if (a + b == c + d) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Сумма цифр данного трехзначного числа N свлсетсс четным числом.
     */
    private static void getExampleThree(int n) {
        int a, b, c;

        a = n / 100;

        b = n / 10 % 10;

        c = n % 10;

        if ((a + b + c) % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Точка с координатами (х, у) принадлежит части плоскости, лежащей между
     * прсмыми х= т, х= п (т<п).
     */
    private static void getExampleFour(int x, int m, int n) {
        if (m < n) {
            if (x >= m && x <= n) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    /**
     * Квадрат заданного трехзначного числа равен кубу суммы цифр стого числа.
     */
    public static void getExampleFive(int n) {
        int a, b, c;

        a = n / 100;
        b = n / 10 % 10;
        c = n % 10;
        int y = a + b + c;
        if (n * n == y * y * y) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Треугольник со сторонами а,b,с свлсетсс равнобедренным.
     */
    private static void getExampleSix(int a, int b, int c) {

        if (a == b && a != c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
     * третьей цифре.
     */
    private static void getExampleSeven(int n) {
        int a, b, c;

        a = n / 100;

        b = n / 10 % 10;

        c = n % 10;

        if (a + b == c || a + c == b || c + b == a) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Заданное число N свлсетсс степенью числа а (показатель степени может
     * находитьсс в диапазоне от 0 до 4).
     */
    public static void getExampleEight(int a, int n) {

        if (n == 1 || n == a || n == a * a * a || n == a * a * a * a) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * График функции у = ах2 + bх+ с проходит через заданную точку с координатами
     * (m, п).
     */
    private static void getExampleNine(int a, int b, int c, int n, int m) {
        int y = (int) (a * Math.sqrt(n) + b * n + c);
        if (y == m) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Длс данных областей составить линейную программу, которас печатает true, если
     * точка с координатами (х, у) принадлежит закрашенной области, и false — в
     * противном случае:
     */
    private static void getTaskThirtyEight(double x, double y) {

        if ((y + Math.abs(x) <= 4) && (y >= 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if((y >= -3 && y <= 0 && x >= -4 && x <= 4) || (y <= 4 && y >= 0 && x >= -2 && x <= 2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if((x * x + y * y <= 25) && y <= 0 && x >= 0 || (x * x + y * y <= 16) && y >= 0 && x >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Дано действительное число х. се пользуссь никакими другими арифметическими
     * операцисми, кроме умноженис, сложенис и вычитанис, вычислите за минимальное
     * число операций:
     */
    public static void getTaskThirtyNine() {
        double x = 2;
        double c = 2 * Math.exp(4 * Math.log(x)) - 3 * Math.exp(3 * Math.log(x)) + 4 * Math.exp(2 * Math.log(x)) - 5 * x
                + 6;
        System.out.println("Равно за 7 операций: " + c);
    }

    /**
     * Дано значение х. Получить значенис Позаботьтесь об скономии операций.
     */
    public static void getTaskForty() {
        double x = 2;
        double a = 4 * Math.exp(3 * Math.log(x));
        double c = 3 * Math.exp(2 * Math.log(x));
        double d = 2 * x;

        double temp1 = -d + c - a;
        double temp2 = 1 + d + c + a;

        System.out.println("Равно за 2 операций: " + temp1);
        System.out.println("Равно за 3 операций: " + temp2);
    }

}
