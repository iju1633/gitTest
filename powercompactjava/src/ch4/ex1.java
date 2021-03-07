package ch4;



	class Student{
		
	String name;
	int rollNum;
	int age; //short도 좋아
	
	void showInfo() {
		System.out.println("학생의 이름: " + name);
		System.out.println("학생의 학번: " + rollNum);
		System.out.println("학생의 나이: " + age);
	
	}
	}
	
	
	public class ex1 {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "Im";
		student.rollNum = 2018920051;
		student.age = 23;
		
		student.showInfo();
		
	}

}
