import java.util.*;
public class Main extends Thread
{
  public static void main(String[] args)
  {
     //craete a thread object
      Main m=new Main();

       //start a thread
        m.start();
   }



@Override
public void run()
      {
//thread processing logic
         System.out.println("Heloo Kushi Welocme to screen ");
       }
}
