package core;

public class Niam {

	public static void main(String[] args) {

		Massive massive = new Massive();

		massive.size = 400;
		System.out.println(massive.sizeOfMassive());

		massive.name = "my massive";
		System.out.println(massive.nameOfMassive());

		System.out.println(massive.add());

		System.out.println(massive.startMassive());

		System.out.println(massive.endMassive());

		System.out.println(massive.division());

		massive.getName();

	}

}
