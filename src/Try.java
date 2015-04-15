import java.util.Scanner;

public class Try {
	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		double[] anArray;
		anArray = new double[3];
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter today's sales for store 1");
			double store1 = keyboard.nextDouble();
			anArray[i] = store1;
			System.out.println(anArray[i]);
		}

	}
}