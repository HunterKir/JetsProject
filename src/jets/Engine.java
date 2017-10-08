package jets;

import java.util.Scanner;

public class Engine {
	static Scanner kb = new Scanner(System.in);
	static Hangar alpha = new Hangar("alpha");
	static Pilot pilots[] = new Pilot[15];
	public static void main(String[] args) {
		alpha.setFleet(0, 439, 18.8, 290, "A-10 Thunderbolt II");
		alpha.setFleet(1, 1500, 150.0, 529, "F-22 Raptor");
		alpha.setFleet(2, 1875, 31.3, 790, "F-15E Strike Eagle");
		alpha.setFleet(3, 630, 737.0, 6900, "B-2 Spirit");
		alpha.setFleet(4, 300, 132.4, 2530, "AC-130");
		pilots[0] = new Pilot("Hunter");
		pilots[1] = new Pilot("Alex");
		pilots[2] = new Pilot("Jake");
		pilots[3] = new Pilot("Greg");
		pilots[4] = new Pilot("Jason");
		pilots[5] = new Pilot("Jen");
		pilots[6] = new Pilot("Aaron");
		pilots[7] = new Pilot("Stumpe");
		pilots[8] = new Pilot("Dave");
		pilots[9] = new Pilot("Alexis");
		pilots[10] = new Pilot("Rosanne");
		pilots[11] = new Pilot("Chris");
		pilots[12] = new Pilot("Airik");
		pilots[13] = new Pilot("Ekubay");
		pilots[14] = new Pilot("Rob");
		while (true) {
			printMenu();
			menuSelect(inputFilter(kb.next()));
		}
	}
	
	public static void printMenu() {
		System.out.println("|-----------------------------------|");
		System.out.println("|   [1] List Fleet                  |");
		System.out.println("|   [2] View Fastest Jet            |");
		System.out.println("|   [3] View Jet w/ Longest Range   |");
		System.out.println("|   [4] Add a Jet                   |");
		System.out.println("|   [5] Manage Pilots               |");
		System.out.println("|   [6] Exit                        |");
		System.out.println("|-----------------------------------|");
	}
	
	public static void menuSelect(int num) {
		boolean loop = true;
		while (loop) {
			if (num == 1) {
				// list fleet
				alpha.listFleet();
				loop = false;
			}
			else if (num == 2) {
				//view fastest jet
				alpha.findFastest();
				loop = false;
			}
			else if (num == 3) {
				//view longest range jet
				alpha.findLongestRange();
				loop = false;
			}
			else if (num == 4) {
				//add a jet
				alpha.addJet();
				loop = false;
			}
			else if (num == 5) {
				//manage pilots
			}
			else if (num == 6) {
				System.out.println("Exiting Program.");
				System.exit(0);
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
