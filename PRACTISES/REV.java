package PRACTISES;
import java.util.*;

public class REV {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;

        for(;temp>0;){
            int digit=temp%100;
            if(digit<10){rev=rev*10+digit;}
            else{rev=rev*100+digit;}
            temp/=100;
        }
        System.out.println(rev);
        
    }
    
}
