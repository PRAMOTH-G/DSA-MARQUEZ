
import java.util.function.DoubleToIntFunction;

 class LDEL {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    void del(int val){
        if(head.data==val){head=head.next;}
        
        Node temp=head;
        while(temp.next!=null&&temp.next.data!=val){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.print("NOT FOUND");
        }
        temp.next=temp.next.next;

    
    }
    void la(int val){
        Node newnode=new Node(val);
        if(head==null){head=newnode;}
        else{
        Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newnode;
    }

}
void d(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;

    }
}
public static void main(String[] args) {
    LDEL p=new LDEL();
    p.la(10);
    p.la(30);
    p.la(50);
    p.d();
    p.del(30);
    p.d();

}
    
}