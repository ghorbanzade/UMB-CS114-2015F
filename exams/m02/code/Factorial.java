public class Factorial {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int counter = 1;
		int result = 1;
		do {
			result *= counter;
			counter++;
		}
		while (counter <= num);
		System.out.println(result);
	}
}
