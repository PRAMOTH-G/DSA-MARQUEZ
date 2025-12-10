public class linkedpos {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        
    }
}

void dataf(int val){
    Node newnode=new Node(val);
    Node temp=head;
    if(head==null){head=newnode;}
    else{
        newnode.next=head;
        head=newnode;
    }


}
 public void pod(int index,int val){
    if(index<0)
        {System.out.print("Stupid");}
    Node newnode=new Node(val);
    Node temp=head;
    for(int i=0;i<index-1;i++){
        temp=temp.next;
    }
    newnode.next=temp.next;
    temp.next=newnode;



}
void dis(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;

}
}
public static void main(String[] args) {
    linkedpos l=new linkedpos();
    l.dataf(10);
    l.dataf(20);
    l.dataf(30);
    l.pod(2,500);
    l.dis();
    
}

}
