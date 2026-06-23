package OOPS_Programs.MethodOverloading.Addition;
//Different Data Types
public class Addition {
    void add(int a, int b) {
        System.out.println("Integer Sum: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Double Sum: " + (a + b));
    }

    public static void main(String[] args) {

        Addition obj = new Addition();

        obj.add(10, 20);
        obj.add(10.5, 20.5);
    }
}
