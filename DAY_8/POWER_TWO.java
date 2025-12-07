package DAY_8;
import java.util.*;
public class POWER_TWO{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n&(n-1);
        String[]arr={"POWER OF 2","NOT A POWER OF 2"};
        int index=(x==0 && n!=0)?0:1;
        System.out.println(arr[index]);
        
    }
}
/*
  0 1 0 0---4
  0 0 1 1 &(n-1)
  -------
  0 0 0 0
  --------


*/