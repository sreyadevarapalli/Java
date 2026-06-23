package Strings;

public class CountVowelsCons {
    public static void main(String[] args)
    {
        String s = "TechieAssociates";
        int count_Vowels= 0;
        int count=0;

        for(int i = 0; i < s.length(); i++)
        {
        	char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count_Vowels++;
            }else {
            	count++;
            }
        }
        System.out.println("Vowels: "+count_Vowels);
        System.out.println("Consonants: "+count);
    }
}
