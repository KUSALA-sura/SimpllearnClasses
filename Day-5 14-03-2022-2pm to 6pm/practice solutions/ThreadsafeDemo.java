 import java.util.*;

//thraed safe in multuithread 

class Counter{

int count;

//increase count ==thread sfae  
public void increaseCount()
{
count++;//count =count+1; or count+=1;
}
//decrease count   it is non-thread safe 
public void decreaseCount()
{
count--;//count =count-1; or count-=1;
}

}

public class  ThreadsafeDemo
{
public static void main(String[] args) throws InterruptedException
{
//create object 
Counter counter=new Counter();


//craete thread one 

Thread t1=new Thread(()->{
for (int i=0;i<1000;i++)
{
counter.increaseCount();
}

});

//craete thread one 

Thread t2=new Thread(()->{
for (int i=0;i<1000;i++)
{
counter.increaseCount();
}

});

//craete thread one 

Thread t3=new Thread(()->{
for (int i=0;i<1000;i++)
{
counter.increaseCount();
}

});
t1.start();
t2.start();
t3.start();


t1.join();
t2.join();
t3.join();

System.out.println("The count ::"+counter.count);

}
}