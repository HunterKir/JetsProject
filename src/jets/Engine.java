package jets;

import java.util.Scanner;

public class Engine {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
	}
	
	public static void printMenu() {
		System.out.println("|-----------------------------------|");
		System.out.println("|   [1] List Fleet                  |");
		System.out.println("|   [2] View Fastest Jet            |");
		System.out.println("|   [3] View Jet w/ Longest Range   |");
		System.out.println("|   [4] Add a Jet                   |");
		System.out.println("|   [5] Exit                        |");
		System.out.println("|-----------------------------------|");
	}
	
	public static void menuSelect(int num) {
		boolean loop = true;
		while (loop) {
			if (num == 1) {
				// list fleet
				loop = false;
			}
			else if (num == 2) {
				//view fastest jet
				loop = false;
			}
			else if (num == 3) {
				//view longest range jet
				loop = false;
			}
			else if (num == 4) {
				//add a jet
				loop = false;
			}
			else if (num == 5) {
				//exit
				loop = false;
			}
			else {
				System.out.println("Invalid input. Try again.");
				num = inputFilter(kb.next());
			}
		}
	}
	
	public static int inputFilter(String input) {
		int num = 0;
		boolean loop = true;
		while (loop) {
			try {
				num = Integer.parseInt(input);
				loop = false;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Try again.");
				input = kb.nextLine();
			}
		}
		return num;
	}
}
