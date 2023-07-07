import java.util.*;

public class Interest 
{
    public static void main(String[]args)
    {
      double SV=Money();
      double finalAmount=Calculation(SV);
       System.out.println("Final amount after one year: $" + finalAmount);
    }
    

public static double Money()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the starting value of the investment");
    double start=sc.nextDouble();
    return start;
}
public static double Calculation(double start)
{   
 double ir=0.05;
 double TotalAmount= start+(ir*start);
 return TotalAmount;
}
}




