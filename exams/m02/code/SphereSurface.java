public class SphereSurface {
	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		double surface = 4 * Math.PI * Math.pow(radius, 2);
		System.out.printf("%.2f\n", surface);
	}
}
