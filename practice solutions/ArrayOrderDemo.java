import java.util.*;
import java.util.Arrays;

public class ArrayOrderDemo
{
public static void main(String[] args)
{
int[] items={-15,20,24,50,26,78,90};

int position=3;
int response=findKthSmallest(items,position);
System.out.println("The position "+position +" Smallest elment is " +response);




int response1=findKthLargest(items,position);
System.out.println("The position "+position +" Largest elment is " +response1);


}

private static int findKthSmallest(int[] items,int position)
{


//sort array in asending order 

Arrays.sort(items);

//return Kth elemet 
return items[position-1];

}


private static int findKthLargest(int[] items,int position)
{


//sort array in asending order 

Arrays.sort(items);

//return Kth elemet 
return items[items.length-position];

}



}