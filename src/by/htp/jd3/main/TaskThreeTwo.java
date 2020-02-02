package by.htp.jd3.main;

import java.util.Scanner;

public class TaskThreeTwo {

    public static void main(String[] args) {
        getTaskFifteen();
        getTaskSeventeen();
        getTaskEighteen();
        getTaskNineteen();
        getTaskTwenty();
        getTaskTwentyOne();
        getTaskTwentyTwo();
        getTaskTwentyThree();
        getTaskTwentyFour(2346236); // не решено
        getTaskTwentyFive();
        getTaskTwentySix();
        getTaskTwentySeven();
        getTaskTwentyEight();
        getTaskTwentyNine();
        getTaskThirty();
        getTaskThirtyTwo("kk_kr");
        getTaskThirtyThree(456);
        getTaskThirtyFour();
        getTaskThirtyFive(346);
        getTaskThirtySix();
        getTaskThirtySeven();
        getTaskThirtyEight(13570);
        getTaskThirtyNine();
        getTaskThirtyForty(100);

    }


    /**
     * 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
     */
    private static void getTaskFifteen() {

        int s;
        s = 3;

        long p;
        p = s;

        for (int i = 3; i <= 10; i++) {
            s += i;
            p *= s;
            System.out.println(" Число " + s + ", " + p);
        }
    }

    /**
     * 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
     */
    private static void getTaskSeventeen() {
        double n;
        double res;
        double a;

        res = 1;
        n = 10;
        a = 10;

        for (int i = 0; i <= n - 1; i++) {
            res = res * (a + i);
            System.out.println(" Число " + res + ", " + i);
        }
    }

    /**
     * 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
     * равен заданному е. Общий член ряда имеет вид:
     */
    private static void getTaskEighteen() {
        double n;
        double b;
        double a;
        double e;

        e = 10;
        n = 10;
        a = 4;
        b = 7;

        for (double i = a; i <= b; i++) {
            n += Math.pow(-1, i - 1) / n;
        }
        if (Math.abs(n) >= e) {
            System.out.println(" Число существует");
        } else {
            System.out.println(" Число не существует");
        }
    }

    /**
     * 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
     * равен заданному е. Общий член ряда имеет вид:
     */
    private static void getTaskNineteen() {
        double n;
        double b;
        double a;
        double e;

        e = 10;
        n = 10;
        a = 4;
        b = 7;

        for (double i = a; i <= b; i++) {
            n += 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        }
        if (Math.abs(n) >= e) {
            System.out.println(" Число существует");
        } else {
            System.out.println(" Число не существует");
        }
    }

    /**
     * 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
     * равен заданному е. Общий член ряда имеет вид:
     */
    private static void getTaskTwenty() {
        double n;
        double b;
        double a;
        double e;

        e = 10;
        n = 10;
        a = 4;
        b = 7;
        for (double i = a; i <= b; i++) {
            n += 1 / (Math.pow(3, i) - 2) + (Math.pow(3, i) + 1);
        }
        if (Math.abs(n) >= e) {
            System.out.println(" Число существует");
        } else {
            System.out.println(" Число не существует");
        }
    }

    /**
     * 21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
     * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
     * значения функции:F(x) = x −sin(x)
     */
    private static void getTaskTwentyOne() {
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
            y = x - Math.sin(x);
            System.out.println("y =" + y);
        }
    }

    /**
     * 22. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
     * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
     * значения функции:
     */
    private static void getTaskTwentyTwo() {
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
            y = Math.pow(Math.sin(x), 2);
            System.out.println("y =" + y);
        }
    }

    /**
     * 23. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
     * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
     * значения функции:
     */
    private static void getTaskTwentyThree() {
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
            y = 1 / Math.tan(x / 3) + 0.5 * Math.sin(x);
            System.out.println("y =" + y);
        }
    }

    /**
     * 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
     * его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
     * числом.
     */
    private static void getTaskTwentyFour(int n) {
        int count = 0;
        int g;
        int e = 0;
        int stepen;
        int sum = 0;
        g = n;

        // количество разрядов
        while (n > 0) {
            count = count + 1;
            n = n / 10;
        }

        int[] mas = new int[count];

        // инициализировать маccив из n цифр
        for (int j = 0; j < mas.length; j++) {
            mas[j] = g % 10;
            g = g / 10;
        }

        for (int j = 0; j < mas.length; j++) {
            if (mas[j] % 2 == 0) {
                sum = sum + mas[j];
            }
        }

        for (int j = 0; j < mas.length; j++) {
            stepen = count - 1;
            e = e + mas[j] * ((int) Math.pow(10, stepen));

            count = count - 1;
        }
        System.out.println("сумма четных цифр=" + sum);
        System.out.println("число в обратном порядке=" + e);
    }

    /**
     * 25. Требуется определить факториал числа, которое ввел пользователь.
     */
    private static void getTaskTwentyFive() {

        int x;
        long a;
        
        a = 1;
        x = 12;

        for (int i = 1; i <= x; i++) {
            a = a * i;
        }
        System.out.println("Факториал числа x = " + a);
    }

    /**
     * 26. Вывести на экран соответствий между символами и их численными обозначениями в памяти
     * компьютера (Таблицу ASCII).
     */
    private static void getTaskTwentySix() {
        for (int i = 0; i <= 255; i++) {
            if (i % 5 == 0) {
                System.out.println(" Число " + i + " в формате ASCII " + (char) i);
            }
        }
    }

    /**
     * 27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
     * самого числа. m и n вводятся с клавиатуры.
     */
    private static void getTaskTwentySeven() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = in.nextInt();

        System.out.print("Input n: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i != m && i != 1) {
                System.out.print(+i + ", ");
            }
        }
    }

    /**
     * 28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
     * результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
     * также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
     * перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
     * ‘0’.
     */
    private static void getTaskTwentyEight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arithmetic sign: ");
        char arithmeticSign = sc.next().charAt(0);

        while (arithmeticSign == '/' || arithmeticSign == '+' || arithmeticSign == '*' || arithmeticSign == '-') {
            System.out.print("Enter the 1st number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter the 2nd number: ");
            int secondNumber = sc.nextInt();

            if (arithmeticSign == '+') {
                int result = firstNumber + secondNumber;
                System.out.println("Result: " + result);

            } else if (arithmeticSign == '-') {
                int result = firstNumber - secondNumber;
                System.out.println("Result: " + result);

            } else if (arithmeticSign == '*') {
                int result = firstNumber * secondNumber;
                System.out.println("Result: " + result);

            } else if (arithmeticSign == '/') {
                int result = firstNumber / secondNumber;
                System.out.println("Result: " + result);

            } else if (arithmeticSign == '/' && secondNumber == 0) {
                System.out.println("Cannot divide by zerro");

            }
            if (arithmeticSign == '/' || arithmeticSign == '+' || arithmeticSign == '*' || arithmeticSign == '-') {
                System.out.println("Wrong Sing!");
            }
            if (arithmeticSign == '0') {
                break;
            }
        }
        sc.close();
    }

    /**
     * 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
     */
    private static void getTaskTwentyNine() {

        int a;
        int b;
        int c;
        int d;

        a = 14;
        b = 56;

        while (a > 0) {
            d = +a % 10;
            a = a / 10;
            c = b;
            while (c > 0) {
                if (c % 10 == d) {
                    System.out.println("29) " + d);
                    break;
                }
                c = c / 10;
            }
        }
    }

    /**
     * 30. Написать программу, переводящую римские цифры в арабские.
     */
    public static void getTaskThirty() {
        String c = "MDLXVI"; // romanian
        char letter;
        int arabian = 0;
        int sum = 0;

        for (int i = 0; i < c.length(); i++) {
            letter = c.charAt(i);

            switch (letter) {
                case ('I'):
                    arabian = 1;
                    break;
                case ('V'):
                    arabian = 5;
                    break;
                case ('X'):
                    arabian = 10;
                    break;
                case ('L'):
                    arabian = 50;
                    break;
                case ('C'):
                    arabian = 100;
                    break;
                case ('D'):
                    arabian = 500;
                    break;
                case ('M'):
                    arabian = 1000;
                    break;

            }
            sum = sum + arabian;

        }
        System.out.println(sum);
    }

    /**
     * 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
     * угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
     * программа, а также ошибочные числа пользователя.
     */
    public static void getTaskThirtyOne() {
        int[] array1 = new int[5];
        int[] array = new int[5];
        int found = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 15 + 1);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Введите 5 чисел в диапазоне от 1 до 15: ");
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            found = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array1[i]) {
                    found++;
                }
            }

            if (found > 0) {
                System.out.println("Совпадение: " + array1[i]);
            } else {
                System.out.println("Не совпало: " + array1[i]);
            }
        }

        for (int j = 0; j < array.length; j++) {
            if ((array[j] <= 0) || (array[j] > 15)) {
                System.out.println("ошибочнов ввели с клавиатуры:" + array[j]);
            }
        }
    }

    /**
     * 32. Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
     * первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
     * буквами, цифрами и знаком подчеркивания.
     */
    public static void getTaskThirtyTwo(String str) {
        char a;
        System.out.println(str);

        a = str.charAt(0);
        if ((Character.isLetter(a)) || (a == '_')) {
            System.out.println("верно введен первый символ");
        } else {
            System.out.println("неверно введен первый символ");
        }

        for (int i = 1; i < str.length(); i++) {
            a = str.charAt(i);
            if ((Character.isLetter(a)) || (a == '_') || (Character.isDigit(a))) {
                System.out.println("верно введен " + (i + 1) + " символ:" + a);
            } else {
                System.out.println("неверно введен " + (i + 1) + " символ:" + a);
            }
        }
    }

    /**
     * 33. Найдите наибольшую цифру данного натурального числа.
     */
    public static void getTaskThirtyThree(int numb) {
        int count = 0;
        int max;
        int g;
        g = numb;

        while (numb > 0) {
            count = count + 1;
            numb = numb / 10;
        }

        int[] mas = new int[count];

        for (int j = 0; j < mas.length; j++) {
            mas[j] = g % 10;
            g = g / 10;
        }

        max = mas[0];

        for (int j = 0; j < mas.length; j++) {
            if (mas[j] > max) {
                max = mas[j];
            }
        }

        System.out.println(max);
    }

    /**
     * 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
     */
    public static void getTaskThirtyFour() {
        int a;
        int b;
        int c;
        int d;
        int k;

        for (int i = 1000; i < 10000; i++) {
            a = (i % 100) % 10;
            b = (i % 100) / 10;
            c = (i % 1000) / 100;
            d = i / 1000;
            k = a + b + c + d;
            if (k == 15) {
                System.out.println(i);
            }
        }
    }

    /**
     * 35. Найдите количество четных цифр данного натурального числа
     */
    public static void getTaskThirtyFive(int n) {
        int g;
        int count = 0;
        g = n;
        int c = 0;

        while (n > 0) {
            count = count + 1;
            n = n / 10;
        }

        int[] mas = new int[count];

        for (int j = 0; j < mas.length; j++) {
            mas[j] = g % 10;
            g = g / 10;
        }

        for (int j = 0; j < mas.length; j++) {
            if (mas[j] % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }

    /**
     * 36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
     * делится на их произведение. Найти эти числа.
     */
    public static void getTaskThirtySix() {
        for (int i = 10; i <= 99; i++) {
            for (int j = 10; j <= 99; j++) {
                if ((i * 100 + j) % (i * j) == 0) {
                    System.out.println("первое число = " + i + " второе число = " + j);
                }
            }
        }
    }

    /**
     * 37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число
     * получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали
     * число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится
     * на 99, а второе на 49.
     */
    public static void getTaskThirtySeven() {
        int a;
        int b;

        for (int i = 10; i <= 99; i++) {
            for (int j = 10; j <= 99; j++) {
                a = i * 100 + j;
                b = j * 100 + i;
                if ((a % 99 == 0) && (b % 49 == 0)) {
                    System.out.println("первое число = " + i + " второе число = " + j);
                }
            }
        }
    }

    /**
     * 38. Для заданного натурального числа определить, образуют ли его цифры арифметическую
     * прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
     */
    public static void getTaskThirtyEight(int n) {
        int g;
        int count = 0;
        g = n;
        int d;

        while (n > 0) {
            count = count + 1;
            n = n / 10;
        }

        int[] mas = new int[count];

        for (int j = 0; j < mas.length; j++) {
            mas[j] = g % 10;
            g = g / 10;
        }

        d = mas[1] - mas[0];

        for (int j = 1; j < mas.length - 1; j++) {
            if (mas[j + 1] - mas[j] != d) {
                System.out.println("не образуют арифметическую прогрессию");
                return;
            }
        }
        System.out.println("образуют арифметическую прогрессию");
    }

    /**
     * 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то
     * получили исходное число. Найти это число.
     */
    public static void getTaskThirtyNine() {
        int x;
        int y;
        int z;
        int n = 100;

        while (n < 999) {
            x = n % 10;
            y = (n / 10) % 10;
            z = (n / 100) % 10;

            if ((y * 10 + x) * 7 == z * 100 + y * 10 + x) {
                System.out.println(n);
            }
            n++;
        }
    }

    /**
     * 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои
     * цифры.
     */
    public static void getTaskThirtyForty(int n) {
        int count = 0;
        int g;
        int k = 1;
        int chislo;
        int check;
        chislo = k;

        while (chislo < n) {
            g = chislo;
            check = 0;

            while (k > 0) {
                count = count + 1;
                k = k / 10;
            }

            int[] mas = new int[count];

            for (int j = 0; j < mas.length; j++) {
                mas[j] = g % 10;
                g = g / 10;
            }

            for (int j = 0; j < mas.length; j++) {
                if ((mas[j] == 0) || (chislo % mas[j] != 0)) {
                    check++;
                }
            }

            if (check == 0) {
                System.out.println(chislo);
            }
            chislo++;
        }

    }
}


