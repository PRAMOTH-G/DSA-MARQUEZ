package DAY_10;
import java.util.*;
public class BINARYTOOCTEL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        int binary=Integer.parseInt(n,2);

        System.out.println("DECIMEL: "+binary);
        String octel=Integer.toOctalString(binary);

        System.out.println("OCTEL: "+octel);


    }
}
