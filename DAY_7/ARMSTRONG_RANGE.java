package DAY_7;
import java.util.*;

public class ARMSTRONG_RANGE {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sout
        }
    }

        public static int Check(int n){
         int  temp=n;
         int digit=String.valueOf(n).length();
         int sum=0;

         for(;temp>0;){
            int rev=temp%10;
            sum+=Math.pow(rev, digit);
            temp/=10;


         }
         System.out.println((sum==n)?n:"an given number");



    }
    
}
