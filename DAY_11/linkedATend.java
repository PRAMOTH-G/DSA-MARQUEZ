class linkedATend {
    Node head;
 
    class Node{
        int data;
        Node next;
        Node(int val){data=val;next=null;}
  
    }

    public void  lastjoin(int val){
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
    void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

public static void main(String[] args) {
    linkedATend e=new linkedATend();
    e.lastjoin(10);
    e.lastjoin(20);
    e.lastjoin(30);
    e.disp();
}

    
}