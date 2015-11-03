public class Coordinate {
	public double[] coordinates = new double[3];
	public Coordinate(double[] coordinates) {
		for (int i = 0; i < this.coordinates.length; i++)
			this.coordinates[i] = coordinates[i];
	}
	public double getDistance(Coordinate point) {
		double sum = 0;
		for (int i = 0; i < 3; i++)
			sum += Math.pow(this.coordinates[i] - point.coordinates[i], 2);
		return Math.sqrt(sum);
	}
}
