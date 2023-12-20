/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
		int coin = Integer.parseInt(args[0]);
		int result1 = coin/25;
		int result2 = coin%25;
		System.out.println("Use " + result1 + " quarters and " + result2 + " cents");
	}
}
