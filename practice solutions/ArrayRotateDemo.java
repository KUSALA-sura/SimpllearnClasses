import java.util.*;

public class ArrayRotateDemo
{
public static void main(String[] args)
{

int[] items={10,20,30,40,50,60};

System.out.println("Before Rotation  :: ");
System.out.println(Arrays.toString(items));

rotateLeft(items,3);

System.out.println("After Rotation  :: ");
System.out.println(Arrays.toString(items));
}

private static void rotateLeft(int[] items,int  position)
{

//create a temp array 

int temp[] =new int [position];

//copy elements into temp array based on position of rotate count we have 

for(int i=0;i<position;i++)
{
temp[i]=items[i];
}

// move /shift actual array to elements to forword direction

for(int i=position;i<items.length;i++)
{
items[i-position] =items[i];
}

//coping the temp element in actual array 

for(int i=0;i<position;i++)
{

items[i + items.length- position ] =temp[i];
}

}

/* private static void rotateRight(int[] items,int position)
{
//craete a temp array 

int temp[] =new int[position];


//craete elements intp tem[]  based on posion

for(int i=0;i<items.length;i--)
{
temp[i]=items[i];

}

// */

}








}