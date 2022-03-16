import java.util.*;

class Customer{
 
double   bal=1000.00;
//show bal
public synchronized void showbal()
{
System.out.println("The accounr balence "+bal);
}

//deposit 

public synchronized void deposit(double amount)
{
System.out.println("The account deposit  ");

bal+=amount;

System.out.println("The deposit is  "+bal );
notify();
}


//withdraw 

public synchronized void withdraw(double amount)
{
if (bal<=amount)
{
System.out.println("The  sufficient balence");
try
{
wait();
}catch (InterruptedException e)
{
e.printStackTrace();
}
}
bal-=amount;
System.out.println("The withdraw  amount is "+bal );
}


}
//another class======

public class ThreadWithWait{

public static void main(String[] args)
{
Customer cus=new Customer();

//crate  thread 

Thread t1 =new Thread(()->{
cus.withdraw(1000);
});

Thread t2 =new Thread(()->{
cus.deposit(2000);
});


Thread t3 =new Thread(()->{
cus.showbal();
});

t1.start();
t2.start();
t3.start();
}
}
















