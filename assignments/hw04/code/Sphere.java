public class Sphere {
	public double radius;
	public Coordinate coordinates;
	public Sphere(double[] coordinates, double radius) {
		this.radius = radius;
		this.coordinates = new Coordinate(coordinates);
	}
}
