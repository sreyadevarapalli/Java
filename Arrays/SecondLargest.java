package Arrays;

public class SecondLargest {
    public void secondLargestElement() {
		int arr[]= {10,50,20,40,30};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Largest Element: "+arr[arr.length-2]);
	}
	public static void main(String[]args) {
		SecondLargest obj=new SecondLargest();
		obj.secondLargestElement();
	}
}
