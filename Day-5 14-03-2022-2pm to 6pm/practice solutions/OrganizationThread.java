import java.util.*;
public class OrganizationThread 
{
public static void main(String[] args)
{
//create object 

Jhon t1=new Jhon();
t1.start();

Kush t2=new Kush();
t2.start();

Sam t3=new Sam();
t3.start();

}

}


class Jhon extends Thread {
@Override
public void run()
{
System.out.println("Jhon Thread is running ");
}
}




class Kush   extends Thread {
@Override
public void run()
{
System.out.println("Kush Thread is running ");
}
}


class Sam   extends Thread {
@Override
public void run()
{
System.out.println("Sam Thread is running ");
}
}