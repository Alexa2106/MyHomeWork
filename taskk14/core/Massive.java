package core;

public class Massive {

	static int size;
	String name;

	int sizeOfMassive() {
		return size * 5;
	}

	String nameOfMassive() {
		return name.toUpperCase();
	}

	public String getName() {
		return this.name;
	}

	public int add() {
		int sum = size + size;
		return sum;
	}

	String startMassive() {
		return "Massive start";
	}

	String endMassive() {
		return "Massive end";
	}

	public String division() {
		try {
			int b = size / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " division by zero");
		} finally {
			return "Im work";
		}
	}

}
