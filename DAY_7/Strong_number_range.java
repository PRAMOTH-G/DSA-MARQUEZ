package DAY_7;
import java.util.*;
public class Strong_number_range {
    public static void main(String[] args) {
            
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            if(STCHECK(i)){System.out.print(i+" ");}
        }
        }
        public static boolean STCHECK(int n){
           int temp=n;
           int check=temp;
           int sum=0;
           while(temp>0){
            int rev=temp%10;
            int fact=1;
            for(int i=1;i<=rev;i++){
                fact=fact*i;

            }
            sum+=fact;
            temp/=10;
           }
           return sum==check;

        }
    }

