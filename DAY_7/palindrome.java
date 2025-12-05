package DAY_7;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            if(PALCHECK(i)){System.out.print(i+" ");}
        }
    }

    public static boolean PALCHECK(int n){
        int temp=n;
        int check=temp;
        int dig=0;

        for(;temp>0;){
            int rev=temp%10;
            dig=dig*10+rev;
            temp/=10;
             
        }
        return check==dig;

    }
    
}
