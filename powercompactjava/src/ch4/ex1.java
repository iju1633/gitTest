package ch4;



	class Student{
		
	String name;
	int rollNum;
	int age; //short�� ����
	
	void showInfo() {
		System.out.println("�л��� �̸�: " + name);
		System.out.println("�л��� �й�: " + rollNum);
		System.out.println("�л��� ����: " + age);
	
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
