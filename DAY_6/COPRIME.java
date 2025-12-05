package DAY_6;
import java.util.*;
public class COPRIME {


    public static int GCD(int a,int b){
        //EUCLIDEAN ALGORITHM
        while(b!=0){
            int temp=b;
             b=a%b;
             a=temp;
        }
        System.out.println("function:"+a);
        return a;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((GCD(a,b)==1)?"COPRIME":"NOT COPRIME");
            
        }


    }
    

