class li{
    Node head;
    li(){
        head=null;
        
    }
        class Node{
        int data;
        Node next;
        
        Node(int d){
            data=d;
            next=null;
        }
    }

public void in(int d){
    Node newNode=new Node(d);
    if(head!=null){
        newNode.next=head;
        
    }
    head=newNode;
    
}
public void di(){
  if(head==null)
  {
      System.out.println("stupid");
      
  }
  else{
      Node temp=head;
      while(temp!=null){
          System.out.print(temp.data+" ");
          temp=temp.next;
      }
  }
}
}

public class FIRST{
    public static void main(String[] args){
        li ll=new li();
        ll.in(10);
        ll.di();
    }
}