import java.util.Scanner;
public class NumberLimit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upper Limit? ");
		int num = input.nextInt();
		input.close();
		int i = 0;
		while (Math.pow(i, 3) < num)
			i++;
		System.out.printf("Number is %d.\n", i - 1);
	}
}
