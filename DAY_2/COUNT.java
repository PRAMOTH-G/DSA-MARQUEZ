import java.util.*;

public class COUNT {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //ARRAY
        int[]arr={100,24,5,6,7};
        int count=0;
        for(int i=0;i<arr.length;i++,count++);

        System.out.println("COUNT IS:"+count);

        //number
        int n=sc.nextInt();
        int c=0;
        for(;n>0;n/=10,c++);
        System.out.println("NUMBER COUNT IS:"+c);

    }
}
