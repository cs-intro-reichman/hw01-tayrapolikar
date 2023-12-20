public class Coins {
	public static void main(String[] args) {
		int coin = Integer.parseInt(args[0]);
		int result1 = coin/25;
		int result2 = coin%25;
		System.out.println("Use " + result1 + " quarters and " + result2 + " cents");
	}
}
