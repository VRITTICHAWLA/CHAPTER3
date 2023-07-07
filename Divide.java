import java.util.Scanner;
class Division
{
 void dividing(int a,int b)
 {
  int q=a/b;
  int r=a%b;
  System.out.println("The quotient is: "+q);
  System.out.println("The remainder is: "+r);
 }
}
public class Divide 
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of divident");
       int a=sc.nextInt();
       System.out.println("Enter the value of divisor");
       int b=sc.nextInt();
       Division d=new Division();
       d.dividing(a,b);
       
    }
    
}
