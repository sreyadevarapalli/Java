package OOPS_Programs.MethodOverriding;

class Employee1 {

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee1 {

    @Override
    void work() {
        System.out.println("Manager is managing the team");
    }
}

public class Employee {

    public static void main(String[] args) {

        Employee1 e = new Employee1();
        e.work();

        Manager m = new Manager();
        m.work();
    }
}