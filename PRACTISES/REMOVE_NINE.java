package PRACTISES;
import java.util.*;
public class REMOVE_NINE{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // int res=n+(n/9);
    // System.out.println(res);


    //removing 9 

    int rem=0;
    int sum=0;

    while(n>0){
        rem=n%9;
        sum=sum*10+rem;
        n/=9;

    }
    System.out.println(sum);


    }

    
}