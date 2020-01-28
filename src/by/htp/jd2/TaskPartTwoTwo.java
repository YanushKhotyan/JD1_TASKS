package by.htp.jd2.main;

import java.util.Scanner;

public class TaskPartTwoTwo {

    public static void main(String[] args) {
        getTaskSixteen(5, -2);
        getTaskSeventeen(5, 7);
        getTaskEighteen(-3, 2, -2);
        getTaskNineteen(4, -2, 6);
        getTaskTwenty(2, 3, 4, 2);
        getTaskTwentyOne();
        getTaskTwentyTwo(5, 7);
        getTaskTwentyThree();
        getTaskTwentyFour(6);
        getTaskTwentyFive(70);
        getTaskTwentySix(4, 6, 3);
        getTaskTwentySeven(7, 3, 2, 6);
        getTaskTwentyEight(234, 164, 6214, 347);
        getTaskTwentyNine(1, 1, 1, 1, 1, 1);
        getTaskThirty(45, 35, 35);
        getTaskThirtyOne(2, 4, 4, 5, 5);
        getTaskThirtyTwo(-5, 7, 3);
        getTaskThirtyThree(9455);
        getTaskThirtyFour(151);
        getTaskThirtyFive(151);
        getTaskThirtySix(4);
        getTaskThirtySeven(3);
        getTaskThirtyEight(3);
        getTaskThirtyNine(3);
        getTaskForty(13);
    }

    /**
     * 16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком
     * координатном угле).
     */
    private static void getTaskSixteen(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("В начале координат. ");
        } else if (x == 0 && y != 0) {
            System.out.println("�?а оси Y");
        } else if (x != 0 && y == 0) {
            System.out.println("�?а оси X");
        } else if (x > 0 && y > 0) {
            System.out.println("I четверть");
        } else if (x < 0 && y > 0) {
            System.out.println("II четверть");
        } else if (x < 0 && y < 0) {
            System.out.println("III четверть");
        } else {
            System.out.println("IV четверть");
        }
    }

    /**
     17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
     из исходных, а если равны, то заменить числа нулями.
     */
    private static void getTaskSeventeen(double x, double y) {
        if (x != y) {
            if (x > y) {
                y = x;
                System.out.println("Y " + y + " X " + x);
            } else {
                x = y;
                System.out.println("Y " + y + " X " + x);
            }
        } else if (x == y) {
            x = 0;
            y = 0;
            System.out.println("Y " + y + " X " + x);
        }
    }

    /**
     * 18. Подсчитать количество отрицательных среди чисел а, b, с
     */
    private static void getTaskEighteen(double a, double b, double c) {
        int positive = 0;
        int negative = 0;
        ;

        if (a > 0) {
            ++positive;
        } else {
            ++negative;
        }

        if (b > 0) {
            ++positive;
        } else {
            ++negative;
        }
        if (c > 0) {
            ++positive;
        } else {
            ++negative;
        }

        System.out.println(" Отрицательные  числа:" + negative);
    }

    /**
     * 19. Подсчитать количество положительных среди чисел а, b, с.
     */
    private static void getTaskNineteen(double a, double b, double c) {
        int positive = 0;
        int negative = 0;
        ;

        if (a > 0) {
            ++positive;
        } else {
            ++negative;
        }

        if (b > 0) {
            ++positive;
        } else {
            ++negative;
        }
        if (c > 0) {
            ++positive;
        } else {
            ++negative;
        }

        System.out.println("Положительных чисел: " + positive);
    }

    /**
     * 20. Определить, делителем каких чисел а, b, с является число k
     */
    private static void getTaskTwenty(double a, double b, double c, double k) {

        if (a % k == 0) {
            System.out.println("число " + k + " является делителем числа " + a);
        } else {
            System.out.println("число " + k + " не является делителем числа " + a);
        }
        if (b % k == 0) {
            System.out.println("число " + k + " является делителем числа " + b);
        } else {
            System.out.println("число " + k + " не является делителем числа " + b);
        }
        if (c % k == 0) {
            System.out.println("число " + k + " является делителем числа " + c);
        } else {
            System.out.println("число " + k + " не является делителем числа " + c);
        }
    }

    /**
     * 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
     * девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
     * текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
     */
    private static void getTaskTwentyOne() {

        char answer = 'Д';

        System.out.println("Кто ты: мальчик или девочка? Введи Д или М");

        System.out.println(answer);

        switch (answer) {
            case 'Д':
                System.out.println("Мне нравятся девочки!");
                break;
            case 'М':
                System.out.println("Мне нравятся мальчики!");
                break;
            default:
                System.out.println("Неверное значение!");
        }
        System.out.println();
    }

    /**
     * 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений,
     * а в y - меньшее
     */
    private static void getTaskTwentyTwo(double x, double y) {
        if (x > y) {
            System.out.println("Переменная х больше перменной y");
        } else {
            double c;

            c = x;

            x = y;

            y = c;
        }

        System.out.println("Переменная х: " + x + " больше перменной y: " + y);
    }

    /**
     * 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены
     * некорректные данные, то сообщить об этом.
     */
    private static void getTaskTwentyThree() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день: ");

        int day;

        day = scanner.nextInt();

        if (day > 0 && day < 32) {

        } else {

            System.out.println("Неверное значение. ");
        }

        System.out.println("Введите месяц: ");

        int month;

        month = scanner.nextInt();

        if (month > 0 && month < 13) {

        } else {

            System.out.println("Неверное значение. ");
        }

        System.out.println("Ваша дата: День " + day + " Месяц " + month);
    }

    /**
     * 24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное
     * данное количество лепестков п.
     */
    private static void getTaskTwentyFour(int a) {

        if (a % 2 != 0) {
            System.out.println("Любит");

        } else {
            System.out.println("Не любит");
        }
    }

    /**
     * 25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение
     * «Пожароопасная ситуация », если температура в комнате превысила 60° С.
     */
    private static void getTaskTwentyFive(int a) {

        if (a > 59) {
            System.out.println("Пожароопасная ситуация!");
        }
    }

    /**
     * 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
     */
    private static void getTaskTwentySix(double a, double b, double c) {
        if (a >= b && a >= c && b >= c) {

            double d;
            d = a + b;

            System.out.println("Сумма большего и меньшего из трех чисел: " + d);
        } else if (a >= b && a >= c && b <= c) {

            double d;
            d = a + c;

            System.out.println("Сумма большего и меньшего из трех чисел: " + d);
        } else if (a <= b && a >= c && b >= c) {

            double d;
            d = b + c;

            System.out.println("Сумма большего и меньшего из трех чисел: " + d);
        }
    }

    /**
     * 27. Найти max{min(a, b), min(c, d)}
     */
    private static void getTaskTwentySeven(double a, double b, double c, double d) {

        if (a > b) {

            double max;
            max = a;

            System.out.println("Максимум из блока (a; b) " + max);
        } else {

            double max;
            max = b;

            System.out.println("Максимум из блока (a; b) " + max);
        }

        if (c > d) {

            double max;
            max = c;

            System.out.println("Максимум из блока (c; d) " + max);
        } else {

            double max;
            max = d;

            System.out.println("Максимум из блока (c; d) " + max);
        }
    }

    /**
     * 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —
     * c).
     */
    private static void getTaskTwentyEight(double a, double b, double c, double d) {

        if (a == d) {
            System.out.println("Число  " + a + " равно числу " + d);
        } else if (b == d) {
            System.out.println("Число  " + b + " равно числу " + d);
        } else if (c == d) {
            System.out.println("Число  " + c + " равно числу " + d);
        } else {

            double e1;
            double e2;
            double e3;

            e1 = d - a;
            e2 = d - b;
            e3 = d - c;

            if (e1 > e2 && e1 > e3) {

                System.out.println("Максимум из трех чисел: " + e1);
            } else if (e2 > e1 && e2 > e3) {

                System.out.println("Максимум из трех чисел: " + e2);
            } else {
                System.out.println("Максимум из трех чисел: " + e3);
            }
        }
    }

    /**
     * 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
     */
    private static void getTaskTwentyNine(double x1, double y1, double x2, double y2, double x3, double y3) {

        double g;
        g = (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);

        if (g == 0) {
            System.out.println("Точки лежат на 1 прямой ");
        } else {
            System.out.println("Точки не лежат на 1 прямой ");
        }
    }

    /**
     * 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если
     * это не так.
     */
    private static void getTaskThirty(double a, double b, double c) {

        if (a > b && b > c) {
            a *= a;
            b *= b;
            c *= c;

            System.out.println("Число  " + a + " число " + b + " и число" + c + " удвоины");
        } else {

            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);

            System.out.println("Число  " + a + " число " + b + " и число" + c + " являются абсолютными");
        }
    }

    /**
     * 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
     * отверстие.
     */
    private static void getTaskThirtyOne(double a, double b, double y, double x, double z) {
        if (a < x && b < y) {
            System.out.println("Кирпич пройдет через отверстие ");
        } else if (a < x && b < z) {
            System.out.println("Кирпич пройдет через отверстие ");
        } else if (a < z && b < y) {
            System.out.println("Кирпич пройдет через отверстие ");
        } else {
            System.out.println("Кирпич не пройдет через отверстие ");
        }
    }

    /**
     * 32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них
     * положительной.
     */
    private static void getTaskThirtyTwo(double a, double b, double c) {

        double ab;
        double ac;
        double bc;

        ab = a + b;
        ac = a + c;
        bc = b + c;

        if (ab > 0) {
            System.out.println("Суммы являются положительными ");
        } else if (ac > 0) {
            System.out.println("Суммы являются положительными ");
        } else if (bc > 0) {
            System.out.println("Суммы являются положительными ");
        } else {
            System.out.println("Суммы не являются положительными ");
        }
    }

    /**
     * 33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в
     * базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют
     * следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 —
     * доступен модуль базы С.
     */
    private static void getTaskThirtyThree(int a) {

        if (a == 9583 || a == 1747) {
            System.out.println("Доступны модули баз А, В, С; ");
        } else if (a == 3331 || a == 7922) {
            System.out.println("Доступны модули баз В, С;");
        } else if (a == 9455 || a == 8997) {
            System.out.println("Доступен модуль базы С.");
        } else {
            System.out.println("Пароль не подходит. Повторите вашу попытку ");
        }
    }

    /**
     * 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
     * запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
     * «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
     * денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
     */
    private static void getTaskThirtyFour(double money) {

        double cost;

        cost = 150.50;

        if (cost == money) {
            System.out.println("Спасибо");
        } else if (cost < money) {

            double a;
            a = money - cost;

            System.out.println("Возьмите сдачу " + a);
        } else if (cost > money) {

            double a;
            a = cost - money;

            System.out.println("Денег недостаточно " + a);
        } else {
            System.out.println("Тавара нет в наличии. ");
        }
    }

    /**
     * 35. Вычислить число и месяц в невисокосном году по номеру дня
     */
    private static void getTaskThirtyFive(int dayNumber) {

        if (dayNumber <= 365) {

            int day;
            day = dayNumber % 30;

            int month;
            month = dayNumber / 30;

            System.out.println("День " + day + " месяц " + month);

        } else {
            System.out.println("Введены некорректные данные ");
        }
    }

    /**
     * 36. Вычислить значение функции:
     */
    private static void getTaskThirtySix(double x) {

        if (x <= 3) {

            double a;
            a = Math.pow(x, 2) - 3 * x + 9;

            System.out.println("X равен: " + a);
        } else if (x > 3) {

            double a;
            a = 1 / (Math.pow(x, 3) + 6);

            System.out.println("X равен: " + a);
        }
    }

    /**
     * 37. Вычислить значение функции:
     */
    private static void getTaskThirtySeven(double x) {

        if (x <= 3) {

            double a;
            a = -Math.pow(x, 2) - 3 * x + 9;

            System.out.println("X равен: " + a);
        } else if (x > 3) {

            double a;
            a = 1 / (Math.pow(x, 3) - 6);

            System.out.println("X равен: " + a);
        }
    }

    /**
     * 38. Вычислить значение функции:
     */
    private static void getTaskThirtyEight(double x) {

        if (x >= 0 && x <= 3) {

            double a;
            a = -Math.pow(x, 2);

            System.out.println("X равен: " + a);
        } else if (x > 0 && x < 3) {

            double a;
            a = 4;

            System.out.println("X равен: " + a);
        }
    }

    /**
     * 39. Вычислить значение функции:
     */
    private static void getTaskThirtyNine(double x) {

        if (x >= 8) {

            double a;
            a = -Math.pow(x, 2) + x - 9;

            System.out.println("X равен: " + a);
        } else if (x < 8) {

            double a;
            a = 1 / (Math.pow(x, 4) - 6);

            System.out.println("X равен: " + a);
        }
    }

    /**
     * 40. Вычислить значение функции:
     */
    private static void getTaskForty(double x) {

        if (x <= 13) {

            double a;
            a = -Math.pow(x, 3) + 9;

            System.out.println("X равен: " + a);
        } else if (x > 13) {

            double a;
            a = -(3 / (x - 6));

            System.out.println("X равен: " + a);
        }
    }
}
