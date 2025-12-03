package DAY_5;
import java.util.*;
public class factroial {

    private static long factorial (int n){
        if(n==0 || n==1){return 1;}
        return n*factorial(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
            
        }
      System.out.println(fact);
      System.out.println("using function:"+factorial(n));
        
    }
}
