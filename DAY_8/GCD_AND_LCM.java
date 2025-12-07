package DAY_8;
import java.util.*;

public class GCD_AND_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD OF NUMBER IS "+GCD(a,b));
        int LCM=(a*b)/GCD(a,b);
        System.out.println("LCM OF NUMBER IS  "+LCM);
        
        
    }
    public static int GCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;

    }
}
