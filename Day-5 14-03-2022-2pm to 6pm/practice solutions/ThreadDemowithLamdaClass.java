import java.util.*;
//ThreadDemoWith   with lamda expression 

public class ThreadDemowithLamdaClass{

public static void main(String[] args)
{
//create object
Thread t1=new Thread(()->{
System.out.println("Threa one Lamda 1");
});
t1.start();


Thread t2=new Thread(()->{
System.out.println("Thread two Lamda 2 @ ");
});
t2.start();


}
}
