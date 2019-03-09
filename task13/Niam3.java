package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Niam {
	public static void main(String[] args) {
		Massive massive = new Massive();

		int[] massive1 = new int[18];

		File file = new File("hfdfdfh");

		try {
			System.out.println(massive.quantityOfPages / 0);
			System.out.println(massive1[20]);

			Scanner scanner = new Scanner(file);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | FileNotFoundException ex) {
			System.out.println("exceptions were catched");
			System.out.println(ex.getMessage());
		}
	}
}
		
		
		



