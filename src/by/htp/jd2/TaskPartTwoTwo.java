package by.htp.jd2;

public class TaskPartTwoTwo {

	public static void main(String[] args) {
		getTaskSixteen(5, -2);
		getTaskSeventeen(5, 7);
		getTaskEighteen(-3, 2, -2);
		getTaskNineteen(4, -2, 6);
		getTaskTwenty(2, 3, 4, 2);
	}

	/**
	 * 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
	 * расположена (на какой оси или в каком координатном угле).
	 */
	private static void getTaskSixteen(int x, int y) {
		if (x == 0 && y == 0) {
			System.out.println("В начале координат. ");
		} else if (x == 0 && y != 0) {
			System.out.println("На оси Y");
		} else if (x != 0 && y == 0) {
			System.out.println("На оси X");
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
	 * 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них
	 * одним и тем же числом, равным большему из исходных, а если равны, то заменить
	 * числа нулями.
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
	 * 19. Подсчитать количество положительных среди чисел а, b, с
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
			System.out.println("Число " + k + " является делителем числа " + a);
		} else {
			System.out.println("Число " + k + " не является делителем числа " + a);
		}
		if (b % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + b);
		} else {
			System.out.println("Число " + k + " не является делителем числа " + b);
		}
		if (c % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + c);
		} else {
			System.out.println("Число " + k + " не является делителем числа " + c);
		}
	}
}
