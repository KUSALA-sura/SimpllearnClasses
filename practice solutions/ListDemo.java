import java.util.*;

public class ListDemo
{
public static void main(String[] args)
{
List<Integer> numberList =new ArrayList<Integer>();

numberList.add(10);
numberList.add(20);
numberList.add(30);
numberList.add(40);
numberList.add(50);
numberList.add(60);

for(int i=0;i<numberList.size();i++)
{
System.out.println(numberList);
}

}
}