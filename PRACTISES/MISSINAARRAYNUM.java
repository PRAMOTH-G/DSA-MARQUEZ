package PRACTISES;
import java.util.*;
public class MISSINAARRAYNUM {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}

        int len=arr.length+1;

        int calculate=len*(len+1)/2;

        int actual=0;

        for(int num:arr){actual+=num;}

        System.out.println(calculate-actual);



    }
}
