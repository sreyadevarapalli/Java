package Interview_Questions;

public class MaximumOccurences {
    public static void main(String[] args) {

        int arr[] = {1,1,1,2,2,3,3,3,3,4};

        int maxCount = 1;
        int currentCount = 1;
        int element = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                element = arr[i];
            }
        }

        System.out.println("Element = " + element);
        System.out.println("Count = " + maxCount);
    }
}
