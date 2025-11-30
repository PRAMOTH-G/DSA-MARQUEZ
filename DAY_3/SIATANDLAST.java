import java.util.*;

public class SIATANDLAST {
    public static void main(String []ars){
        Scanner sc=new Scanner(System.in);
        // number 
        int n=sc.nextInt();
        // int last=n%10;
        // for(;n>10;n=n/10);
        // int first =n;
        // System.out.println(first+last);
       // array
       int []arr=new int [n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int first=arr[0];
       int last=arr[arr.length-1];
       System.out.println(first+last);
       System.out.println(last-first);

    }
    
}