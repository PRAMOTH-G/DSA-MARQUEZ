package DAY_10;
import java.util.*;

public class BINARYTOHEXA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        int decimal=Integer.parseInt(n,2);
        System.out.println(decimal);
        String hex=Integer.toHexString(decimal);

        System.out.println("HEXADECIMEL: "+hex.toUpperCase());

    }
}
