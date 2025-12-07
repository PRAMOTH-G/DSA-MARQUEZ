package DAY_8;
import java.util.*;
public class SQUARE {

    public static boolean square(int n){
        for(int i=1;i<=n;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(square(n)){
            System.out.println("SQUARE"+" "+n);
        }
        else{
            System.out.println(" NOT SQUARE"+" "+n);

        }
    }
    
}
