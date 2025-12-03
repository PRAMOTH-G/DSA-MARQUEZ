package DAY_5;
import java.util.*;

public class STRONG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;

        int sum=0;
        for(;temp>0;){
            int rem=temp%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                 fact=fact*i;
            }
       
            System.out.println("FACTORIAL REM:"+fact);
            sum+=fact;
            temp/=10;


        }
        System.out.println((sum==n)?"STRONG NUMBER":"NOT AN STRONG NUMBER");

    }
}
