import java.util.*;

public class SUM_AND_PRODUCT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int pro=1;
       
        while(n>0){
            int digit=n%10;//123-->3
            pro*=digit;
            sum=sum+digit;//0+3=3
            n=n/10;//123/10=12
        }
        System.out.println(sum);
        System.out.println(pro);
    
    }
    
}
