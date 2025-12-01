class Linkedlist{
    Node head;// to accesing Linkedlist
    
    Linkedlist(){head=null;}
        class Node{//value to linked list data and next
        int data;
        Node next;
        
        Node(int d){ //intialize value
            data=d;
            next=null;
            
        }
    }
    public void insetAtbeign(int d){
        Node newnode= new Node(d);
        if(head !=null){
            newnode.next=head;
        }
        head=newnode;
    }
    
    public void display(){
    if(head==null){
        System.out.print("STUPID");
    }
    else{
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }
    }
    }
}
public class Main{
    public static void main(String [] args){
        Linkedlist l=new Linkedlist() ;
        l.insetAtbeign(10);
        l.insetAtbeign(20);
        l.insetAtbeign(20);

        
        l.display();
    }
}