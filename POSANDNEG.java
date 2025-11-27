import java.util.Scanner;
public class POSANDNEG{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // with condition statement
        if(num==0){System.out.println("ZERO");}
        else if(num>0){System.out.println("POSITIVE");}
        else{System.out.println("NEGATIVE");}

        // without condition statement
        /* SIGN BIT -->0 as Even
         * SIGN BIT -->1 as Odd
         */
        int sign=(num>>31)&1; // sign bit extraction
        String[] arr={"POSTIVE","NEGATIVE"};
        System.out.println(arr[sign]);
    }
}
