public class NPrimes {
	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		int number = 1;
		for (int i = 0; i < count; i++) {
			while (true) {
				number++;
				boolean isPrime = true;
				for (int j = 2; j < number; j++) {
					if (number % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					break;
				}
			}
			System.out.println(number);
		}
	}
}
