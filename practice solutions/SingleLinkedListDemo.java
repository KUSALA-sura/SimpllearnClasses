import java.util.*;

public class SingleLinkedListDemo
{


private Node head;
private int size;

//get size 
public int getSize()
{
return size;
}

//is empty
public boolean isEmpty()
{
return head == null;
}

//add to front 

public void addToFront(Employee data)
{
//create a node

Node node=new Node(data);
node.setNext(head);
head =node;
size++;
}



//remove from front
public Node removeNode()
{
if(isEmpty())
{
return null;
}
Node removeNode =head;
head=head.getNext();
size --;

removeNode .setNext(null);
return removeNode ;
}


//print list
public void printList()
{
Node current =head;
System.out.println("Head --> ");
while(current != null)
{
System.out.println(current);
System.out.println("->");
current=current.getNext();
}
System.out.println("----");
}


public static void main(String[] args)
{
Employee emp1=new Employee(1001,"Kushi","CSE",90000.0);

//create instance of singly linke dlist 


SingleLinkedListDemo list=new SingleLinkedListDemo ();
System.out.println("The List size "+list.getSize());

System.out.println("The List size "+list.isEmpty());


//add data in front 
list.addToFront(emp1);


System.out.println("---------");
System.out.println("Lise Size "+list.getSize());
System.out.println("The List size "+list.isEmpty());
System.out.println("---------");

list.printList();

}
}







class Node
{

private Employee  data;
private  Node  next;

//create Node 

public Node(Employee data)
{
this.data=data;
}

public Employee getData()
{
return data;
}


public Employee setData(Employee data)
{
this.data=data;
return data;
}


public Node getNext()
{
return next;
}


public Node setNext(Node next)
{
this.next=next;
return next;
}

@Override
public String toString()
{
return data.toString();
//return  next.toString();
}


}































