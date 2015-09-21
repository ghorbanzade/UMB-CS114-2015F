//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

public class Temperature {
	public static void main(String[] args) {
		double celsius = Double.parseDouble(args[0]);
		double fahrenheit = celsius * 1.8 + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " fahrenheit.");
	}
}
