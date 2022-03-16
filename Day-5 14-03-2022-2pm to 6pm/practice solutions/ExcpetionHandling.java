import java.util.*;

public class ExcpetionHandling{
public static void main(String[] args)
{

srtLengthCalculator("Hello wolrd ");
srtLengthCalculator(null);
srtLengthCalculator("Kushi  Draling ....");


System.out.println("-----------");
transaction(10);
transaction(0);

}

private static  void srtLengthCalculator(String str)
{try{

int length =str .length();
System.out.println("The string length  "+length);

}catch(NullPointerException e)
{

System.out.println("exception  "+e.getClass());

System.out.println("The exception message  "+ e.getMessage());
}
}


private static void transaction(int amount)
{try
{
int  bal=3000;
int  res=bal/amount;
System.out.println("reslut  amount ::"+res);
}catch(ArithmeticException e)
{
System.out.println("exception  "+e.getClass());

System.out.println("The exception message  "+ e.getMessage());
}


}
}


























