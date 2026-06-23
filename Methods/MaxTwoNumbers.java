package Methods;

public class MaxTwoNumbers {

//Return Type

    /*public static int maximum(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[]args) {
		int a=100;
		int b=78;
		int Max=maximum(a,b);
		System.out.println("Maximum of "+a+","+b+": "+Max);
	}*/

//Void Method

    /*public static void maximum(int a,int b) {
		if(a>b) {
			System.out.println("A: "+a);
		}else {
			System.out.println("B: "+b);
		}
	}
	public static void main(String[]args) {
		maximum(100,78);
	}*/

//Terenary Operator

    public static int max(int a, int b) {
	        return (a > b) ? a : b;
	    }
	public static void main(String[]args) {
		System.out.println("Maximum: "+max(100,78));
	}

}
