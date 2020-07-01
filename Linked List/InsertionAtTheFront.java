class InsertionAtTheFront {
 static Node head ;

static class Node {
Node next ;
int data ;
Node(int data1)
{
data=data1;
next=null ;
 } 	}

public void displayList(Node head)
{
Node curr=head ;
while(curr != null)
{
    System.out.println("---" + curr.data );
	curr=curr.next;

}
}

public static void main(String args[])
{
InsertionAtTheFront obj=new InsertionAtTheFront();
head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
System.out.println("Before Insertion List :");
obj.displayList(obj.head);
//Insertion
Node given=new Node(0);
given.next=head;
head=given; 
System.out.println("After Insertion List :");
obj.displayList(head);
}
}
