package Arrays;

public class AvgArr {
   public static void main(String[] args) {
    int arr[]={10,45,67,3,4,5,10};
    int sum=0;
    for(int i=1;i<arr.length;i++){
        sum+=arr[i];
    }
    double avg=(double)(sum/arr.length);
    System.out.println("Average of array Elements: "+avg);
   } 
}
