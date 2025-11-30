import java.util.Scanner;

public class DISARIUMNUMBER {
   

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;

        String conv=String.valueOf(n);// convert number to string
        int sum=0;
        for(int i=0;i<conv.length();i++){ // iterate through each character
            int digit=conv.charAt(i)-'0';   // convert char to int
            int position=i+1;// position of digit
            sum+=Math.pow(digit,position); // calculate disarium sum
        }
        System.out.println((sum==n)?"DISARIUM NUMBER":"NOT DISARIUM NUMBER");

}
}
