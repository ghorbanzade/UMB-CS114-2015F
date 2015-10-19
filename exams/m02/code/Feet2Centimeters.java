public class Feet2Centimeters {
	public static void main(String[] args) {
		double conversion = 30.48;
		double cm = Double.parseDouble(args[0]) * conversion;
		System.out.println(cm);
	}
}
