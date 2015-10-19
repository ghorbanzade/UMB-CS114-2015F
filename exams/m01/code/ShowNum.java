public class ShowNum {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		for (int i = 0; i < limit; i++) {
			System.out.printf("%d, ", i);
		}
	}
}
