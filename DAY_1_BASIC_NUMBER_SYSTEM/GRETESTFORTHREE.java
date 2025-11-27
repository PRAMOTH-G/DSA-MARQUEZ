import java.util.*;

public class GRETESTFORTHREE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // Method-1
        int diff=a-b;
        int k=(diff>>31)&1; // sign bit extraction
        int max1=new int[]{a,b}[k];

        int diff2=max1-c;
        int k2=(diff2>>31)&1;
        int max2=new int[]{max1,c}[k2];
        System.out.println("Greatest Number is: "+max2);
    
        




    }
    
}
