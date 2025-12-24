package PRACTISES;

public class FIB {
    static int fibn(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        
        return fibn(n-1)+fibn(n-2);
        

    }
    public static void main(String[]args){
        int n=7;
        for(int i=0;i<n;i++){System.out.print(fibn(i)+" ");}
        System.out.println();
        System.out.println(fibn(n));
    }
    
}
