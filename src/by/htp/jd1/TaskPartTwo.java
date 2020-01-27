package by.htp.jd1;

public class TaskPartTwo {

    public static void main(String[] args) {
        getTaskSixteen(2314);
        getTaskSeventeen(4, 5);
        getTaskEighteen(4);
        getTaskNineteen(7);
        getTaskTwenty(5);
        getTaskTwentyOne(457.323);
        getTaskTwentyTwo(3454423);
        getTaskTwentyThree(2, 5);
        getTaskTwentyFive(3.0, 7.0, 2.0);
    }

    /**
     * 16. Найти произведение цифр заданного четырехзначного числа.
     */
    private static void getTaskSixteen(int n) {
        int m = 1;

        for (int i = 0; i < 4; i++) {
            m *= n % 10;
            n /= 10;
        }
        System.out.println("Произведение: " + m);
    }

    /**
     * 17. Даны два числа. сайти среднее арифметическое кубов стих чисел и среднее
     * геометрическое модулей стих чисел.
     */
    public static void getTaskSeventeen(double a, double b) {

        double c = (a * Math.sqrt(a) + b * Math.sqrt(b)) / 2;
        double x = Math.sqrt(Math.abs(a * b));

        System.out.println("Среднее арифметичеcкое кубов равно " + c);
        System.out.println("Среднее геометричеcкое модулей равно  " + x);
    }

    /**
     * 18. Дана длина ребра куба. сайти площадь грани, площадь полной поверхности и
     * объем стого куба.
     */
    public static void getTaskEighteen(double a) {

        double b = a * a;
        double c = 4 * (a * a);
        double d = a * a * a;

        System.out.println("Площадь грани куба равна " + b);
        System.out.println("Площадь куба равна " + c);
        System.out.println("Обьем куба равен " + d);
    }

    /**
     * 19. Дана сторона равностороннего треугольника. сайти площадь стого
     * треугольника, его высоту, радиусы вписанной и описанной окружностей.
     */
    public static void getTaskNineteen(double a) {

        double b = a * a * (Math.sqrt(3) / 4);

        double c = Math.sqrt((a * a) - ((a * a) / 4));

        double d = a / Math.sqrt(3);

        double e = a / (2 * Math.sqrt(3));

        System.out.println("Площадь треугольника равна " + b);
        System.out.println("Выcота треугольника равна  " + c);
        System.out.println("Радиуc опиcанной окружноcти правильного треугольника равен " + d);
        System.out.println("Радиуc впиcанной окружноcти правильного треугольника равен " + e);
    }

    /**
     * 20. Известна длина окружности. сайти площадь круга, ограниченного стой
     * окружностью.
     */
    public static void getTaskTwenty(double a) {

        double b = a / (2 * Math.PI);

        double c = Math.PI * (b * b);

        System.out.println("Площадь круга ограниченного стой окружностью равна " + c);
    }

    /**
     * 21. Дано действительное число R вида nnn.ddd (три цифровых разрсда в дробной
     * и целой частсх). Поменсть местами дробную и целую части числа и вывести
     * полученное значение числа.
     */
    private static void getTaskTwentyOne(double a) {

        double res = separationOfRemain(a);

        double src = (int) a;

        double src1 = src / 1000;

        double res2 = res + src1;

        System.out.println("Обратное чиcло " + res2);
    }

    public static int separationOfRemain(double someNumber) {

        return Integer.parseInt(String.valueOf(someNumber).substring(getCountsOfDigits((int) someNumber) + 1));
    }

    private static int getCountsOfDigits(long number) {

        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    /**
     * 22. Дано натуральное число Т, которое представлсет длительность прошедшего
     * времени в секундах. Вывести данное значение длительности в часах, минутах и
     * секундах в следующей форме: ссч ММмин SSc.
     */
    private static void getTaskTwentyTwo(long a) {

        long hours = a / 3600;

        long minutes = (a % 3600) / 60;

        long seconds = a % 60;

        System.out.println(hours + " ч " + minutes + " мин " + seconds + " сек ");
    }

    /**
     * 23. сайти площадь кольца, внутренний радиус которого равен r, а внешний — R
     * (R> r).
     */
    private static void getTaskTwentyThree(double r, double r1) {

        double radius = 0;

        if (r1 > r) {
            radius = Math.PI * ((r1 * r1) - (r * r));

            System.out.println("Чиcло равно " + radius);

        } else {

            System.out.println("Внешний радиуc не может быть меньше внутреннего: ошибка в переменной R ");

        }
    }

    /**
     * 24. сайти площадь равнобедренной трапеции с основанисми а и b и углом α при
     * большем основании а.
     */
    private static void getTaskTwentyFour(double a, double b, double c) {

        double h = 0;

        double s = 0;

        if (c > 0.0 && c < 360.0 && a > b) {

            h = (a - b) / 2 * Math.tan(c);

            s = (a + b) / 2 * h;

            System.out.println("Площадь равна " + s);

        } else {
            System.out.println("Уcловис заданы неправильно ");
        }
    }

    /**
     * 25. Вычислить корни квадратного уравненис ах2+ bх + с = 0 с заданными
     * косффициентами a, b и с (предполагаетсс, что а≠0 и что дискриминант уравненис
     * неотрицателен).
     */
    public static void getTaskTwentyFive(double a, double b, double c) {

        double d = b * b - 4 * a * c;

        double x1, x2;

        if (d > 0 && a > 0) {

            x1 = -b + Math.sqrt(d) / (2 * a);

            x2 = -b - Math.sqrt(d) / (2 * a);

            System.out.println("Первый корень равен " + x1 + ", " + "Второй корень равен" + x2);

        } else {

            System.out.println("Уcловие не выполнено ");
        }
    }
}
