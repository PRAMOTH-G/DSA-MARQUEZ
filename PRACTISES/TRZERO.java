package PRACTISES;
import java.util.*;
public class TRZERO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//         int count=0;

//         for(;n>0;){
//             n=n/5;
//             count+=n;
//         }
//         System.out.println(count);

          int count=0;
          if(n==0){System.out.println(1) ;
          return;
          }

            while(n%10==0){
                count++;
                n/=10;
        }
    
          System.out.println(count);

    }
    
}
