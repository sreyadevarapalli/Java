package Loops;

public class Palindrome {
    public static void main(String[] args) {
        int n=121222;
        int original=n;
        int rev=0;
        while(n>0){
            int digit =n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(original==rev){
            System.out.println("Is a Palidrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
