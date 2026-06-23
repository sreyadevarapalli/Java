package OOPS_Programs.Polymorphism;



class Employee2 {

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee2 {

    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

class Tester extends Employee2 {

    @Override
    void work() {
        System.out.println("Tester tests applications");
    }
}

class Manager extends Employee2 {

    @Override
    void work() {
        System.out.println("Manager manages the team");
    }
}

public class Employee {

    public static void main(String[] args) {

        Employee2 e;

        e = new Developer();
        e.work();

        e = new Tester();
        e.work();

        e = new Manager();
        e.work();
    }
}