package by.htp.jd2;

public class TaskPartTwoOne {

	public static void main(String[] args) {
		getTaskOne();
		getTaskTwo();
		getTaskThree(2);
		getTaskFour(3, 3);
		getTaskFive(3, 5);
		getTaskSix(6, 3);
		getTaskSeven(4, -2, -5, 2);
		getTaskEight(3, 5);
		getTaskNine(6, 6, 6);
		getTaskTen(5, 3);
		getTaskEleven(4, 2, 6, 3);
		getTaskTwelve(3, -2, 2);
		getTaskThirteen(-4, 2, -5, -2);
		getTaskFourteen(30, 90);
		getTaskFiveteen(7, 4);
	}

	/**
	 * 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
	 * на экран цифру 7, в противном случае – цифру 8.
	 */
	private static void getTaskOne() {
		if (1 < 2) {
			System.out.println("7 ");
		} else {
			System.out.println("8 ");
		}
	}

	/**
	 * 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
	 * на экран слово «yes», в противном случае – слово «no»
	 */
	private static void getTaskTwo() {
		if (1 < 2) {
			System.out.println("yes ");
		} else {
			System.out.println("no ");
		}
	}

	/**
	 * 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на
	 * экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
	 */
	private static void getTaskThree(double a) {
		if (a < 2) {
			System.out.println("yes ");
		} else {
			System.out.println("no ");
		}
	}

	/**
	 * 4. Составить программу: равны ли два числа а и b?
	 */
	private static void getTaskFour(double a, double b) {
		if (a == b) {
			System.out.println("yes ");
		} else {
			System.out.println("no ");
		}
	}

	/**
	 * 5. Составить программу: определения наименьшего из двух чисел а и b.
	 */
	private static void getTaskFive(double a, double b) {
		if (a > b) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}

	/**
	 * 6. Составить программу: определения наибольшего из двух чисел а и b.
	 */
	private static void getTaskSix(double a, double b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	/**
	 * 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при
	 * заданных значениях a, b, c и х
	 */
	private static void getTaskSeven(double a, double b, double c, double x) {
		double modul = Math.abs(a * Math.pow(x, 2)) + Math.abs(b * x) + Math.abs(c);
		System.out.println(modul);
	}

	/**
	 * 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b
	 */
	private static void getTaskEight(double a, double b) {
		if (a > b) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}

	/**
	 * 9. Составить программу, которая определит по трем введенным сторонам,
	 * является ли данный треугольник равносторонним.
	 */
	private static void getTaskNine(double a, double b, double c) {
		if (a == b && b == c && a == c) {
			System.out.println("Треугольник равносторонний. ");
		} else {
			System.out.println("Треугольник не равносторонний. ");
		}
	}

	/**
	 * 10. Составить программу, которая определит площадь какого круга меньше.
	 */
	private static void getTaskTen(double r1, double r2) {

		double s1 = Math.PI * Math.pow(r1, 2);
		double s2 = Math.PI * Math.pow(r2, 2);

		if (s1 > s2) {
			System.out.println("Площадь круга r1 больше. ");
		} else {
			System.out.println("Площадь круга r2 больше. ");
		}
	}

	/**
	 * 11. Составить программу, которая определит площадь какого треугольника
	 * больше.
	 */
	private static void getTaskEleven(double a1, double h1, double a2, double h2) {

		double s1 = (0.5 / a1) * h1;
		double s2 = (0.5 / a2) * h2;

		if (s1 > s2) {
			System.out.println("Площадь треугольника A больше. ");
		} else {
			System.out.println("Площадь треугольника B больше. ");
		}
	}

	/**
	 * 12. Даны три действительных числа. Возвести в квадрат те из них, значения
	 * которых неотрицательны, и в четвертую степень — отрицательные.
	 */
	private static void getTaskTwelve(double a, double b, double c) {
		double a1 = 0;
		double b1;
		double c1;
		if (a > 0) {
			a1 = Math.pow(a, 2);
			System.out.println("Число A не отрицательное. " + a1);
		} else {
			a1 = Math.pow(a, 4);
			System.out.println("Число A отрицательное. " + a1);
		}

		if (b > 0) {
			b1 = Math.pow(b, 2);
			System.out.println("Число A не отрицательное. " + b1);
		} else {
			b1 = Math.pow(b, 4);
			System.out.println("Число A отрицательное. " + b1);
		}

		if (c > 0) {
			c1 = Math.pow(c, 2);
			System.out.println("Число A не отрицательное. " + c1);
		} else {
			c1 = Math.pow(c, 4);
			System.out.println("Число A отрицательное. " + c1);
		}
	}

	/**
	 * 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
	 * которая из точек находится ближе к началу координат.
	 */
	private static void getTaskThirteen(double x1, double y1, double x2, double y2) {

		if (x1 < 0) {
			x1 = x1 / -1;
		}

		if (y1 < 0) {
			y1 = y1 / -1;
		}

		if (x2 < 0) {
			x2 = x2 / -1;
		}

		if (y2 < 0) {
			y2 = y2 / -1;
		}

		double a = x1 + y1;
		double b = x2 + y2;

		if (a > b) {
			System.out.println("B  ближе. ");
		} else if (b > a) {
			System.out.println("A  ближе. ");
		} else if (a == b) {
			System.out.println("A и B равны. ");
		}
	}

	/**
	 * 14. Даны два угла треугольника (в градусах). Определить, существует ли такой
	 * треугольник, и если да, то будет ли он прямоугольным.
	 */
	private static void getTaskFourteen(int a, int b) {

		if (a > 0 && b > 0 && a + b <= 180) {
			System.out.println("Треугольник существует  ");
			if (a == 90 || a + b == 60 || b == 90) {
				System.out.println("Треугольник прямоугольный  ");
			} else {
				System.out.println("Треугольник не прямоугольный  ");
			}
		} else {
			System.out.println("Треугольник существует  . ");
		}
	}

	/**
	 * 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих
	 * двух чисел заменить половиной их суммы, а большее — их удвоенным
	 * произведением.
	 */
	private static void getTaskFiveteen(double x, double y) {
		if (x != y) {
			if (x > y) {
				y = (x + y) / 2;
				x = x * y;
				System.out.println("X равен " + x + " и Y равен " + y);
			} else {
				x = (x + y) / 2;
				y = x * y;
				System.out.println("X равен " + x + " и Y равен " + y);
			}
		} else {
			System.out.println("Условия не верны. ");
		}
	}
}
