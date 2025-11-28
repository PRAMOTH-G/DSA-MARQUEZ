import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println((rev==copy)?"Palindrome":"Not a Palindrome");

        //string Method
        String s1=sc.next();
        String s2=s1;

        String r="";
        for(int i=s1.length()-1;i>=0;i--){
            r+=s1.charAt(i);
        }
        System.out.println(r);
        System.out.println((r.equals(s2))?"Palindrome":"Not a Palindrome");



    }
}
