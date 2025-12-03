package DAY_5;
import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            

            if(i!=n/i){
                // to print factors in pairs
                System.out.print(n/i+" ");
            }
        }
        }
    }
}
