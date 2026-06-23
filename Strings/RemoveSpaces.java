package Strings;

public class RemoveSpaces {
    /*public static void main(String[]args) {
		String s1="S R E Y A";
		s1=s1.replace(" ", "");
		System.out.println("String: "+s1);
	}*/
    public static void main(String[] args) {

        String str = "T e c h i e  A s s o c i a t e s  J a v a  T r a i n i n g";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
