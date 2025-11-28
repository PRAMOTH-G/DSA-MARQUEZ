import java.util.*;

public class REVERSE {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int rev=0;
        for(;n>0;n/=10){
            rev=rev*10+n%10;
        }
        System.out.println("REVERSED NUMBER IS:"+rev);
        //twice reverse
        while(rev>0){
            n=n*100+rev%100;
            rev/=100;
        } 
        System.out.println(" TWICE REVERSED NUMBER IS:"+n);
    }
}
