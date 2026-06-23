package OOPS_Programs.MethodOverloading;
//Different number of Parameters
public class Addition1 {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void main(String[] args) {

        Addition1 obj = new Addition1();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
