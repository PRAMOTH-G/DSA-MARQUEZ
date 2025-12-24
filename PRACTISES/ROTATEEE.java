package PRACTISES;
import java.util.*;
public class ROTATEEE {
    static void rotate(int[] arr,int st,int en){
        while (st<en){
        int temp=arr[st];
        arr[st]=arr[en];
        arr[en]=temp;
        st++;
        en--;
        }
    }

    static void ch(int[] arr,int k){
       int n=arr.length;

        k=k%n;

        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
 }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int k=3;
        ch(arr, k);
        System.out.println(Arrays.toString(arr));
        
    }
}

