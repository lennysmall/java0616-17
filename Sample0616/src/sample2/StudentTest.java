package sample2;

import java.util.Scanner;

public class StudentTest {

	
	public Student getStudentInfo(){
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("name: ");
		student.setName(sc.next());
		System.out.println("kor score: ");
		student.setKor(sc.nextInt());
		System.out.println("math score: ");
		student.setMath(sc.nextInt());
		System.out.println("eng score: ");
		student.setEng(sc.nextInt());
		
		return student;
	}
	
	public void showStudentInfo(Student student){
		System.out.println("이름"+student.getName()+":");
		System.out.println("국어"+student.getKor()+":");
		System.out.println("수학"+student.getMath()+":");
		System.out.println("영어"+student.getEng()+":");
		System.out.println("총점"+student.getTotal()+":");
		System.out.printf("평균%.2f \n\n",student.getAverage());
	}
	
	public static void main(String[] args) {
		Student[] students = new Student[3];
		//배열크기 지정해야함
		StudentTest test = new StudentTest();
		
		for(int i=0; i<students.length; i++){
			students[i] = test.getStudentInfo();
		}
		for(int i =0; i<students.length; i++){
			test.showStudentInfo(students[i]);
		}

	}

}
