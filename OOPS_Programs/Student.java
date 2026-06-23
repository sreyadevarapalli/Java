package OOPS_Programs;

public class Student {
    int id;
	double marks;
	String name;
	public void displayDetails() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
	public static void main(String[]args) {
		Student s1=new Student();
		s1.id=101;
		s1.name="Sreya";
		s1.marks=98.99;
		s1.displayDetails();
	}
}
