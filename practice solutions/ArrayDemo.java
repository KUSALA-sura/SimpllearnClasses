import java.util.*;
class ArrayDemo
{
public static void main(String[] args)
{
//declare an array 
//array is fixed size array and alos called static array 

 int[]  numbers =new int[6];

numbers[0]= 20;
numbers[1]=10;
numbers[2]=50;
numbers[3]=60;
numbers[4]=90;
numbers[5]=-76;


int[] items={10,20,30,40,50,60};

display(items);

}

private static void display(int[] items)
{

System.out.println("----------");
//for loop with counter index 
for(int i=0;i<items.length;i++)
{
System.out.println("The Index  "+  i  +" and value  " +items[i]);
}
System.out.println("----------");

//for loop for wnhnced 
for(int item : items)
{
System.out.println("The value "+item);
}

System.out.println("-------");







}



}
