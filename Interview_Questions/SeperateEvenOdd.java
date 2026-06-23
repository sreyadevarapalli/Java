package Interview_Questions;

public class SeperateEvenOdd {
     public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.print("Even Numbers: ");

        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        System.out.print("Odd Numbers: ");

        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
