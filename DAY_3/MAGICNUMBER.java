import java.util.*;

public class MAGICNUMBER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int check=(n%9==0)?9:(n%9);
        String res=(check==1)?"MAGIC NUMBER":"NOT MAGIC NUMBER";
        System.out.println(res);
        
    }
    
}
