package DAY_10;
import java.util.*;
public class BINARY2DECIMAL{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int result=0;
        
        for(int i=0;i<n.length();i++){
            result=result<<1;

            result=result|(n.charAt(i)-'0');




        }
        System.out.println(result);

        
    }
    
}