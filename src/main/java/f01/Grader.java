/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f01.q5;

public class Grader {
	public static void main(String[] args) {
		Student student = new Student("Mike");
		student.addGrade(95);
		student.addGrade(80);
		student.addGrade(65);
		System.out.println(student.getAverage());
	}
}
