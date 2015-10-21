import java.util.Scanner;
public class Deviation {
	public static void main(String[] args) {
		double[] numbers = getNumbers();
		double deviation = findDeviation(numbers);
		System.out.printf("Standard Deviation: %.3f\n", deviation);
	}
	public static double[] getNumbers() {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter count: ");
		int num = input.nextInt();
		double[] numbers = new double[num];
		System.out.printf("Enter %d Numbers: ", num);
		for (int i = 0; i < num; i++) {
			numbers[i] = input.nextDouble();
		}
		input.close();
		return numbers;
	}
	public static double findDeviation(double[] numbers) {
		double mean = findMean(numbers);
		double sum = 0;
		for (int i = 0; i < numbers.length; i++)
			sum += Math.pow(numbers[i] - mean, 2);
		double deviation = Math.sqrt(sum / (numbers.length - 1));
		return deviation;
	}
	public static double findMean(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++)
			sum += numbers[i];
		double mean = sum / numbers.length;
		return mean;
	}
}
