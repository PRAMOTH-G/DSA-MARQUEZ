class LINKED{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }

    public void insertAtbegin(int val){
        Node newnode= new Node(val);
        if(head==null){head=newnode;}
        else{newnode.next=head;
            head=newnode;
        }


    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
      LINKED i=new LINKED();
      i.insertAtbegin(10);
      i.insertAtbegin(20);
      i.display();

    }
}