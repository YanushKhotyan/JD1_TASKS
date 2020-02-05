package by.htp.jd4.decomposition;

import java.util.Arrays;

public class Decomposition {
    public static void main(String[] args) {
        printArea(4, 3, 6);
        printNod(6, 2, 6, 4);
        printTaskFourNok(444, 242, 100);
        printTaskFivePrint(7, 2, 4);
        printTaskFivePrintOne(5, 1, 4);
        printTaskSix(8);
        printTaskSeven(12);
    }

    /**
     * 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
     */

    public static int countArea(int a, int b, int c) {
        return (a + b + c) / 2;
    }

    public static void printArea(int a, int b, int c) {
        System.out.println("Area = " + countArea(a, b, c));
    }

    /**
     *  2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
     * натуральных чисел:
     */


    /**
     * 3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
     */
    public static int getNod(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void printNod(int a, int b, int c, int d) {
        System.out.println("Наибольшее общее делителя четырех натуральных чисел равно " + getNod(getNod(a, b), getNod(c, d)));
    }

    /**
     * 4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
     */
    private static long getTaskFourNod(long a, long b) {
        long tmp;
        while (a != 0 && b != 0) {
            a %= b;
            tmp = a;
            a = b;
            b = tmp;
        }
        return a + b;
    }

    private static long getTaskFourNok(long a, long b) {
        return a / getTaskFourNod(a, b) * b;
    }

    public static void printTaskFourNok(long a, long b, long c) {
        System.out.println("Наименьшее общего кратное трех натуральных чисел равно " + getTaskFourNok(a, getTaskFourNok(b, c)));
    }

    /**
     * 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел
     */

    public static long getTaskFive(long a, long b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static long getTaskFiveOne(long a, long b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void printTaskFivePrint(long a, long c, long b) {
        System.out.println("Большее из трех чисел равно " + getTaskFive(getTaskFive(a, b), c));
    }

    public static void printTaskFivePrintOne(long a, long c, long b) {
        System.out.println("Меньшее из трех чисел равно " + getTaskFiveOne(getTaskFiveOne(a, b), c));
    }

    /**
     * 6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
     * треугольника.
     */
    public static double getTaskSix(double a) {
        a = (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
        return a;
    }

    public static void printTaskSix(double a) {
        System.out.println("Площадь правильного шестиугольника со стороной " + a + " " + getTaskSix(a));
    }

    /**
     * 7. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
     * пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
     */
    public static int[] getTaskSeven(int a) {
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30));
        }
        Arrays.sort(array);
        return array;
    }

    public static int getArrayMin(int a) {
        int[] b = getTaskSeven(a);
        return b[0];
    }

    public static int getArrayMax(int a) {
        int[] b = getTaskSeven(a);
        return b[b.length - 1];
    }


    public static void printTaskSeven(int a) {
        System.out.println("самое большое расстояние из точки " + getArrayMin(a) + " до точки " + getArrayMax(a));
    }
}
