/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f01.q5;

public class Student {
	private String name;
	private int[] grades;
	private int numCourses;
	public Student(String name) {
		this.name = name;
		this.numCourses = 0;
		this.grades = new int[10];
	}
	public void addGrade(int grade) {
		this.grades[this.numCourses] = grade;
		this.numCourses++;
	}
	public double getAverage() {
		double sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += this.grades[i];
		}
		return sum / numCourses;
	}
}
