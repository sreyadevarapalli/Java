package OOPS_Programs;

public class Employee {
    int Empid=2404;
	String name="Kalyan";
	double Salary=200000;
	public void display() {
		System.out.println("Employee Id: "+Empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+Salary);
	}
	public static void main(String[]args) {
		Employee e1=new Employee();
		e1.display();
	}
}
