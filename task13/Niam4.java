package pack;

import java.io.IOException;
import java.util.Scanner;

public class Niam {
	public static void main(String[] args) {
		Scanner scanner2 = new Scanner(System.in);
		while (true) {
			int x = Integer.parseInt(scanner2.nextLine());
			if (x != 0 ) {

				try {

					throw new IOException();
					
				} catch (IOException e) {
					System.out.println("It isn't 0");
				}
				catch (NumberFormatException ex) {
					System.out.println("It isn't number");
				}
				finally {
					System.out.println("i am work");
				}
			}
		}
	}
}


