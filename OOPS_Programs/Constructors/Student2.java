package OOPS_Programs.Constructors;
//Constructor Overloading
public class Student2 {
    int id;
    String name;

    Student2() {
        System.out.println("Default Constructor");
    }

    Student2(int id) {
        this.id = id;
    }

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2();

        Student2 s2 = new Student2(101);
        System.out.println(s2.id);

        Student2 s3 = new Student2(102, "Sreya");
        System.out.println(s3.id + " " + s3.name);
    }
}
