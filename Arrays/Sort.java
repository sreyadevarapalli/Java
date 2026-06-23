package Arrays;

public class Sort {
    public void sort(){
    int arr[]= {100,80,50,76,45,90,87};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int num:arr) {
			System.out.println(num+"");
		}
	}
	public static void main(String[] args) {
		Sort obj=new Sort();
		obj.sort();
	}
}
