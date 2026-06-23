package Arrays;

public class CountEvenOdd {
    public void countEvenOdd() {
		int arr[]= {10,15,20,25,30,35,40};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd Count: "+oddCount);
	}
	public static void main(String[]args) {
		CountEvenOdd obj=new CountEvenOdd();
		obj.countEvenOdd();
	}
}
