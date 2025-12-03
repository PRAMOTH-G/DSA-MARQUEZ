package DAY_5;
import java.util.*;
public class PERFECT{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                sum +=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("SUM:"+sum);
        System.out.println((sum==n)?"PERFECT":"NOT PERFECT");
    }
}
