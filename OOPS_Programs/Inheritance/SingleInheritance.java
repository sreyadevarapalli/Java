package OOPS_Programs.Inheritance;
class Employee{
    void work(){
        System.out.println("Employee Works");
    }
}
class Developer extends Employee{
    void code(){
        System.out.println("Developer Writes Code");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Developer d=new Developer();
        d.work();
        d.code();
    }
}
