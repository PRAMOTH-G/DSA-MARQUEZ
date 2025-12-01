package DAY_4;
import java.util.*;
public class pronic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(i*(i+1)==n){
                flag=true;
                System.out.println("YES");
                break;
            }

        }
        if(flag==false){
            System.out.println("NO");
        }
    }
    
}
