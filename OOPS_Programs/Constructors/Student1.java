package OOPS_Programs.Constructors;
//Parameterized Constructor
public class Student1 {
    int id;
	String name;
	double salary;
	Student1(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[]args) {
		Student1 s=new Student1(1204,"Sowjanya",40000);
		s.display();
	}
}
