package Number_Programs;

public class Perfect {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum += 1;
            }
        }
        if(sum==n){
            System.out.println("Is Perfect");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }
}
