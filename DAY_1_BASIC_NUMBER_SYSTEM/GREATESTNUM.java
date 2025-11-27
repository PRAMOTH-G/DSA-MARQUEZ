import java.util.*;
public class GREATESTNUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // two number-Method-1
        int a=sc.nextInt(); //20
        int b=sc.nextInt();//10
        int diff=a-b;//10
        int k=(diff>>31)&1; //10>>31=0  0&1=0

        int[] big={a,b};
        int[] small={b,a};
        System.out.println("Greatest Number is: "+big[k]);//big[0]=20 big[1]=10
        System.out.println("Smallest Number is: "+small[k]);//  small[0]=10 small[1]=20
        //Method -2
        int res=(a>b)?a:b;
        System.out.println("Greatest Number is: "+res);

       






    }
}
