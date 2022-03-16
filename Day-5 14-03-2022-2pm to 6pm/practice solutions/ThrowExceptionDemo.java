import java.util.*;
public class ThrowExceptionDemo{

public static void main(String[] args)
{
ageValidator(30);
try{

ageValidator(12);
}catch(Exception e)
{
System.out.println(e.getMessage());
}
//throw:: throw is keyword is used to an exception in runtime

System.out.println("-----------------------------");
try{
usernameValidator("Kushi darling ......!!");
usernameValidator(null);
//usernameValidator("");
}catch(Exception e)
{
System.out.println(e.getMessage());
}

}
private static void ageValidator(int age)
{
if (age>=18)
{
System.out.println("Your eligible for Vote !! :: ");
}else{
throw new RuntimeException("Your age is invalid "+age);
}
}

private static void usernameValidator(String username)throws Exception

{
if(username!=null  && username.length()>0)
{
System.out.println("Valid Username"+username);
}  else
{
throw new Exception("Your username "+username+"Not username null");
}
}

}