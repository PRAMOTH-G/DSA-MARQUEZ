import java.util.*;
public class SPYNUMBER {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();  
      int digit=(n%9==0)?0:(n%9);
      System.out.println("sum: " +digit);
      int product=1;
      for(;n>0;){
        int rem =n%10;
        product*=rem;
        n/=10;
      }
      System.out.println("product: "+product);
        System.out.println((digit==product)?"SPY NUMBER":"NOT SPY NUMBER");

    }
}