/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
