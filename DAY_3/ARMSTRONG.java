import java.util.*;
public class ARMSTRONG {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;

        int digit=String.valueOf(n).length();
        int sum=0;

        for(;temp>0;){
            int rev=temp%10;
            sum+=Math.pow(rev,digit);
            temp=temp/10;
        }
        System.out.println((sum==n)?"ARMSTRONG":"NOT ARMSTRONG");
        
    }
}