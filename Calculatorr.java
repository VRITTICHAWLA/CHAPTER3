import java.util.Scanner;
class Doing
{
 double Ing(double p,double c,double d)
 {
    double tp=p+c;
    double dis=tp*(d/100);
    double fp=(p+c)-dis;
    return fp;
    

 }
}
public class Calculatorr 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of item: ");
        double p=sc.nextDouble();
        System.out.println("Enter the salesperson commision as percentage: ");
        double c=sc.nextDouble();
        System.out.println("Enter the customer discount as percentage: ");
        double d=sc.nextDouble();
        Doing o=new Doing();
        double finalPrice=o.Ing(p,c,d);
        System.out.println("the final price is: "+finalPrice);



    }
}
