package core;

public class Massive {

	public int summary(int a, int b, int c) {
		return a + b + c;
	}

	public int mulDiv(int a, int b, int c) {
		return a * b / c;
	}

	public int multyArray(int[] array) {
		int mul = 1;
		for (int i = 0; i < array.length; i++) {
			mul = mul * array[i];
		}
		return mul;
	}

	public int divArray(int[] array) {
		int div = 240;
		for (int i = 0; i < array.length; i++) {
			div = div / array[i];
		}
		return div;
	}

	public String isName(String[] mas) {
		return "Person¹2";
	}

	public int smtArr(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;

	}

	public int minus(int a, int b) {
		return b - a;
	}

	public int minPlus(int a, int b, int c, int d) {
		return a - b + c - d;
	}

	public int minMul(int a, int b, int c) {
		return a * b - c;
	}

}
