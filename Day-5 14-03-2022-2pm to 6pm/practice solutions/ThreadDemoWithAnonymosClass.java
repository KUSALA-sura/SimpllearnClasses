import java.util.*;

public class ThreadDemoWithAnonymosClass{
public static void main(String[] args)
{

//create object

Thread t1=new Thread(new Runnable(){
@Override 
public void run()
{
System.out.println("Thread is Nothing Thraed @ 1 ");
}


});

t1.start();


Thread t2=new Thread(new Runnable()
{
@Override
public void run()
{
System.out.println("This is Kushi Thraed @ 2");
}

});

t2.start();
}

}