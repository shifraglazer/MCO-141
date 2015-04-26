import java.util.Scanner;

public class TriangleClass {

	public static void printSpaces(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");
		}
	}

	public static void printLastRow(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}

	public static void printFirstRow(int rows) {
		for (int i = 1; i <= rows; i++) {
			System.out.print("*");
		}
	}

	public static void main(String args[]) {

		System.out.println("How many rows?");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		scanner.close();

		printSpaces(rows - 1);

		// for (int i = 1; i<= rows-1; i++){
		// System.out.print (" ");
		// }
		System.out.println("*");

		int outsideSpaces = rows - 2;
		int insideSpaces = 1;
		for (int i = 1; i <= rows - 2; i++) {

			printSpaces(outsideSpaces);

			// for (int j = 1; j<=outsideSpaces; j++){
			// System.out.print (" ");
			// }
			System.out.print("*");

			// for (int j = 1; j<= insideSpaces; j++){
			// System.out.print (" ");
			// }

			printSpaces(insideSpaces);
			System.out.println("*");
			outsideSpaces--;
			insideSpaces += 2;

			// printFirstRow(rows);
			// printMiddleRows(rows);

		}
		printLastRow(rows * 2 - 1);

	}

}
