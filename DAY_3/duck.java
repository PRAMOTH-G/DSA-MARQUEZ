import java.util.*;
public class duck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);
        int []arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(arr));
        String check=(arr[0]==0)?" DUCK NUMBER": "NOT DUCK NUMBER";
        System.out.println(check);
        
}
}