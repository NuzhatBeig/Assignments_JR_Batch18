package classes;

import student.Student;// importing from Students class of student package

public class School {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.name = "Sam";
		stud.grade = 6;
		System.out.println(stud.name);
		System.out.println(stud.grade);
	}
}
