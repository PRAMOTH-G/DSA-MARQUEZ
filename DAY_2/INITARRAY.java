import java.util.*;
class INITARRAY{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
         
        }
         System.out.print("ARRAY:");
         for(int x:arr){
            System.out.print(x+" ");
         }
        
        


        
    }
}