import java.util.*;
import java.io.*;
public class Oddintervals
{
   public static void main(String[] args)throws IOException
   {
     
 int a;
 int g; 
 BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter first number");
 a=Integer.parseInt(vc.readLine());
 System.out.println("enter second number");
 g=Integer.parseInt(vc.readLine());
for(;a<=g;)
 {
   System.out.println(a);
 a=a+2;
 }
}
}
