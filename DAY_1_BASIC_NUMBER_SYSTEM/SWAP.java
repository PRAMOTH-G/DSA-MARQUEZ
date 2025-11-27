public class SWAP {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // swap with third variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a+" b: "+b);
        // swap without third variable
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a: "+a+" b: "+b);
        // one liner swap
        b=a+b-(a=b);
        System.out.println("a: "+a+" b: "+b);
    }
    
}
