public class Point {
	public double[] coordinates;
	public Point(double[] coordinates) {
		this.coordinates = coordinates;
	}
	public double getDistance(Point point) {
		double sum = 0;
		for (int i = 0; i < 3; i++)
			sum += Math.pow(this.coordinates[i] - point.coordinates[i], 2);
		return Math.sqrt(sum);
	}
}
