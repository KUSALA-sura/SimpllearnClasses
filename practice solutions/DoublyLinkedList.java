public class DoublyLinkedList
{

private Link head;
private int size;
  
//constructor for the head values 
public DoublyLinkedList()
{
head =null;
size=0;
}

//checking size 
public int Size()
{
return size;
}


//is emplty checking for linkedlist

public boolean isEmpty()
{
return head ==null;
}


//add the data to front 

public void addFront(int data)
{
if(head==null)
{
head=new Link(null,data,null);
}
else
{

Link newLink=new Link(null,data,head);
head.previous =newLink;
head =newLink;
}
size++;
}

//print the values 
public void print()
{
Link current=head;
while(current !=null)
{
System.out.println(current.Data());
current =current.next;
}
}


public static void main(String[] args)
{

DoublyLinkedList dl=new DoublyLinkedList();


//System.out.println("The size "+dl.getSize());

System.out.println("The file empty "+dl.isEmpty());

dl.addFront(5);
dl.addFront(20);
dl.print();

}













}