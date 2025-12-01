package DAY_4;
import java.util.*;
public class harsad {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        if(temp%sum==0){
            System.out.print("HARSAD NUMBER");
        }
        else{
            System.out.print("NOT A HARSAD NUMBER");
        }
    }
}