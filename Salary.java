import java.util.*;

public class Salary 
{
        public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter the hourly pay rate");
     double payRate=sc.nextDouble();
     System.out.println("Enter your regular hours of work");
     int regular=sc.nextInt();
     System.out.println("Enter the overtime hours you work");
     int overtime=sc.nextInt();
     double ot=OverTime(payRate,regular,overtime);
     System.out.println("the overtime pay is: "+ot);
    }
    public static double OverTime(double payRate,int r,int o)//methods without using class
    {
     double otp=(payRate*r)+(o*(1.5*payRate));
     return otp;
    }

}
/*import java.util.*;
class pay
{
    void OverTime(double payRate,int r,int o)
    {
     double otp=(payRate*r)+(o*(1.5*payRate));
     System.out.println("the overtime pay is: "+otp);
    }
}
public class Salary 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter the hourly pay rate");
     double payRate=sc.nextDouble();
     System.out.println("Enter your regular hours of work");
     int regular=sc.nextInt();
     System.out.println("Enter the overtime hours you work");
     int overtime=sc.nextInt();
     pay p=new pay();
     p.OverTime(payRate,regular,overtime);
    }
    
} */
