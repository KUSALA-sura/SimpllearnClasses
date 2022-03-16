import java.util.*;
public class CompanyThread
{
public static void main(String[] args)
{

//create object  of Bob 

Bob r1=new Bob();
Thread th=new Thread(r1);
th.start();

Kushi r2=new Kushi();
Thread th1=new Thread(r2);
th1.start();

Laddu r3=new Laddu();
Thread th2=new Thread(r3);
th2.start();

}
}






class Bob implements Runnable
{
@Override
public void run()
{
System.out.println("Bob is running");
}
}



class Kushi  implements Runnable
{
@Override
public void run()
{
System.out.println("Kushi is running");
}
}


class Laddu implements Runnable
{
@Override
public void run()
{
System.out.println("Laddu is running");
}
}