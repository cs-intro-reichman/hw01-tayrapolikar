/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side.
 * This is known as the Triangle Inequality Theorem.
 * Write a program that tests if three given integers form a triangle.
 */
public class Triangle {
		public static void main(String[] args) {
			// Put your code here
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int n3 = Integer.parseInt(args[2]);
			boolean result = false;
			if((n1 + n2 > n3) && (n1 + n3 > n2) && (n2 + n3 > n1)){
				result = true;
			}else{
				result = false;
			}
			System.out.println(n1 + ", " + n2 + ", " + n3 + ": " + result);

		}
	}
