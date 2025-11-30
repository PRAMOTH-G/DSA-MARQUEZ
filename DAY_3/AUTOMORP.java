import java.util.Scanner;
public class AUTOMORP {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        // if(String.valueOf(n*n).endsWith(String.valueOf(n))){
        //     System.out.println("AUTOMORPHIC NUMBER");
        // }
        // else{
        //     System.out.println("NOT AUTOMORPHIC NUMBER");
        // }
        int square=n*n;
        int count=0;
        for(;temp>0;){
            temp/=10;
            count++;

        }
        int product=1;
        for(int i=1;i<=count;i++){
            product*=10;
        }
        if(square%product==n){
            System.out.println("AUTOMORPHIC NUMBER");
        }
        else{
            System.out.println("NOT AUTOMORPHIC NUMBER");
        }
        
    }

    
}
