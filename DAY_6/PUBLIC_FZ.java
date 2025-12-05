package DAY_6;
import java.util.*;
public class PUBLIC_FZ{
    public static ArrayList<Integer> check(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=2;i<=n;i++){
            while(n%i==0 && n>0){
                ans.add(i);
                n=n/i;
            }

        }
        return ans;

    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Integer> fin= check(n);

    for(int x:fin){
        System.out.print(x+" ");
    }
    


    
}
}