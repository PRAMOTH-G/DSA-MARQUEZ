class Linkedist{
    Node head;
    Linkedist(){
        head=null;}
        class Node{
            int data;
            Node next;
        
        Node(int d){
            data=d;
            next=null;
            
        }
    }
    
    public void inB(int d){
        Node newnode=new Node(d);
        if(head!=null){
            newnode.next=head;
        }
        head=newnode;
    }
    
    public void dis(){
        if(head==null){
            System.out.print("STUPID");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public void inL(int d){
        Node newnode=new Node(d);
        if(head==null){head=newnode;}
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
                
            }
            temp.next=newnode;
        }
        
    
}
}



public class reee{
    public static void main(String[] args){
        Linkedist l=new Linkedist();
        l.inB(10);
        l.inB(40);
        l.inB(20);
        l.inL(30);
        l.dis();
        
    }

}