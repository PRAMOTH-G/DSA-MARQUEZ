import java.util.*;
public class SUMODDEVEN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int sumeven=0;
        int sumodd=0;
        for(int i:arr){
            if((i&1)==0){
                sumeven+=i;
            }else{
            sumodd+=i;
        }
        }
        System.out.println("odd: "+sumeven);
        System.out.println("even: "+sumodd);

        
        
    }

    
}