package OOPS_Programs.Constructors;
//Default Constructor
public class Student {
    int id;
	String name;
	double salary;
	Student(){
		id=1124;
		name="Pranathi";
		salary=15000;
	}
	void display() {
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student Salary: "+salary);
	}
	public static void main(String[]args) {
		Student s=new Student();
		s.display();
	}
}
