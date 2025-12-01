package DAY_4;
import java.util.*;
public class sunny {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int root=n+1;
        int next=(int)Math.sqrt(root);
        System.out.println((next*next==root)?"YES":"NO");

    }
}
