
public class Triangle {
		public static void main(String[] args) {
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
