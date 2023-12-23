/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
    // Put your code here
        public static void main(String[] args) {
            Double a = Double.parseDouble(args[0]);
            Double b = Double.parseDouble(args[1]);
            Double c = Double.parseDouble(args[2]);

            Double result = (c - b) / a;

            System.out.println(a + " * x + " + b + " = " + c);

            System.out.print("X = " + result);
            
        }
    }
