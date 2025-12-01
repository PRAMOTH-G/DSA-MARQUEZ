package DAY_4;
import java.util.*;
public class evil {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        String bin=Integer.toBinaryString(n);
        System.out.println(bin);

        String binary="";

        int temp=n;
        for(;temp>0;){
            int rem=temp%2;
            binary=rem+binary;
            temp=temp/2;

        }
        System.out.println(binary);
        // int one=Integer.parseInt(binary);
        // int count=0;

        // for(;one>0;){
        //     int r=one%10;
        //     if(r==1){
        //         count++;
        //     }
        //     one=one/10;
        
        // }
int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;

            }
        }
        if(count%2==0){
            System.out.println("EVIL NUMBER");
        }
        else{
            System.out.println("NOT AN EVIL NUMBER");
        }


    }
}
