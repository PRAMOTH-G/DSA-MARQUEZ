package PRACTISES;
import java.util.*;

public class SMALLESTPOS {
    public static void main(String[]args){
        int[]arr={1,2,3,8,9};
        int n=arr.length;

        Arrays.sort(arr);

        int res=1;

        for(int i=0;i<n;i++){
            if(arr[i]<=res){res+=arr[i];}
            else{break;}


        }
        System.out.println(res);
        System.out.println(30>>3);
        System.out.print();
    }
    
}
