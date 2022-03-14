import java.util.*;
import java.lang.*;

public class SimpleExceptionDemo {
public static void main(String[] args)
{
System.out.println("The exception program ....");
try
{
int bal=2300;
int amount =70;
int res=bal/amount;
System.out.println("Result  Avg  bal Factor is  :: "+res);
}catch(ArithmeticException e)
{
System.out.println("The Exception handled and occured "+e.getClass());
}finally{
System.out.println("Always Running !!");
}
System.out.println("The program terminated");
}
}