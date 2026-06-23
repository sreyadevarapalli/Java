package Arrays;

public class SumArr {
    public static void main(String[] args) {
        int arr[]={10,45,67,3,4,5,10};
        int sum=0;
        for(int i=1;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("Sum of array Elements: "+sum);
    }
}
