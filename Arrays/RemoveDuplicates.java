package Arrays;

public class RemoveDuplicates {
    public void removeDuplicates() {
		int arr[]= {10,20,10,10,20,30,40,50,80,10,30,40};
		System.out.println("Array without Duplicates: ");
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate =true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.println(arr[i]+" ");
			}
		}
	}
	public static void main(String[]args) {
		RemoveDuplicates obj=new RemoveDuplicates();
		obj.removeDuplicates();
	}
}
