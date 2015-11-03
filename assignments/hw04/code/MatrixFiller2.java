import java.util.Scanner;
public class MatrixFiller2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Size of Matrix: ");
		int size = input.nextInt();
		input.close();
		Matrix matrix = new Matrix(size, size);
		matrix.display();
	}
}
