public class l {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }

        void s(int val){
            Node newnode=new Node(val);
            if(head==null){head=newnode;}
            else{
            newnode.next=head;
            head=newnode;}

        }

        void d(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    public static void main(String[] args) {
        l q=new l();
        q.s(10);
        q.s(20);
        q.s(30);
        q.d();
        
    }
}
