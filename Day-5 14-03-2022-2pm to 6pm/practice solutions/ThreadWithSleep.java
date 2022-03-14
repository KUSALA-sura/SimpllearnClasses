import java.util.*;
public class ThreadWithSleep{
public static void main(String[] args)
{

Thread t1=new Thread(()->{

System.out.println("The t1 is working");
});


Thread t2=new Thread(()->{
try
{
Thread.sleep(5000);
}
catch (InterruptedException e)
{
e.printStackTrace();
}
System.out.println("The t2 is working");

});



Thread t3=new Thread(()->{

System.out.println("The t3 is working");
});

t1.start();
t2.start();
t3.start();


}
}