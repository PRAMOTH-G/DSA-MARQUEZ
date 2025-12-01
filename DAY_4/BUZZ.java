package DAY_4;
import java.util.*; 
public class BUZZ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n%10==7)||n%7==0?"BUZZ NUMBER":"NOT A BUZZ NUMBER");

    }
    
}
