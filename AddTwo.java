/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Put your code here
		int numb1 = Integer.parseInt(args[0]);
		int numb2 = Integer.parseInt(args[1]);
		int sum = numb1 + numb2;
		System.out.println(numb1 + " " + "+" + " " + numb2 + " " + "=" + " " + sum);
	}
}
