public class GenThree {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int diff = Math.max(a,b) - Math.min(a,b);

		int n1 = (int) (diff * Math.random() + Math.min(a, b));
		int n2 = (int) (diff * Math.random() + Math.min(a, b));
		int n3 = (int) (diff * Math.random() + Math.min(a, b));
		System.out.println(n1 + "\n" + n2 + "\n" + n3);

		int min = Math.min(n1, n2);
		System.out.println("The minimal genereated number was " + Math.min(n3, min));



	}


}