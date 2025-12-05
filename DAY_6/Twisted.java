package DAY_6;
import java.util.*;
public class Twisted {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp=n;
        int rev=0;
        for(;temp>0;){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        System.out.println("rev: "+rev);
        boolean flag=true;
        for(int i=2;i<rev;i++){
            if(rev%i==0){flag=false;}
            break;

        }
        System.out.println((flag)?"prime":"notprime");
    }
}