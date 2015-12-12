/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
