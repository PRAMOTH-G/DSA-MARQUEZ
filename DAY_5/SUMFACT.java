package DAY_5;
import java.util.*;
public class SUMFACT {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int store;
        for(int i=2;i<n;i++){
            if(n%i==0){
                store=i;

                System.out.print("factors are : "+i);

            if(i!=n/i){
                System.out.print("fators of n/1:"+n/i);

            }
            }

        }        
    }
    
}
