import java.util.*;
public class ODDorEVEN{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();

        // with condition Statement
        String result=(value%2==0)?"even":"odd";
        System.out.println(result);

        // without condition Statement
        String[]arr={"even","odd"};
        System.out.println(arr[value%2]);


        /* bitwiswe AND 
        LSB --> 0 --> even
        LSB --> 1 --> odd
        */ 
        
        String[]and={"even ","odd"};
        System.out.println(and[value&1]);

    }
}