package Strings;

public class Reverse {
    public void revStr() {
		String s="JAVA";
        String rev = "";

        for(int i = s.length()-1; i >= 0; i--)
        {
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);
	}
	public static void main(String[]args) {
		Reverse s1=new Reverse();
		s1.revStr();
    }
}
