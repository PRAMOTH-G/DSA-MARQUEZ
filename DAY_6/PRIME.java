package DAY_6;
import java.util.*;
public class PRIME{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean prime=true;
            if(n<=1){prime=false;}
            else { 
                for(int i=2;i*i<=n;i++){
                if(n%i==0){
                  prime=false;
                     break;}
}
            }
System.out.println(prime?"PRIME":"NOT A PRIME");
}
}