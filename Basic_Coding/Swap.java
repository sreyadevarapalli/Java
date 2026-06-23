package Basic_Coding;

public class Swap {
    public static void main(String[]args){
        int a = 20;
        int b = 45;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }
}
