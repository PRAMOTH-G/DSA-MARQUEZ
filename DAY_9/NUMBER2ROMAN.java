package DAY_9;
import java.util.*;
public class NUMBER2ROMAN {


    static int[] value={1000,900,500,400,100,50,40,10,9,5,4,1};
    static String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static String toRoman(int num){
        StringBuilder sh=new StringBuilder();

        for(int i=0;i<value.length;i++){
            for(;num>=value[i];){
                num-=value[i];
                sh.append(symbol[i]);
            }
        }
        return sh.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(toRoman(n));
    }
    
}