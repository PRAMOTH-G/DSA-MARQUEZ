import java.util.*;
public class NEON {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int square=n*n;
        int check=(square%9==0)?9:(square%9);
        System.out.println(check);
        System.out.println((check==n)?"NEON NUMBER":"NOT NEON NUMBER");
    }
}