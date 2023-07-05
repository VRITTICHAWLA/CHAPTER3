class SumDiff
{
 void Sum(int a,int b)
 {
  System.out.println("the sum of "+a+" and "+b+" is : "+(a+b));
 }
 void Difference(int b,int c)
 {
  System.out.println("the difference of "+b+" and "+c+" is: "+(b-c));
 }
 int Product(int a,int b)
 {
  return a*b;
 }
}

    public class Numbers2
     {
    public static void main(String[]args)
    {
        int a=6;
        int b=5;
        SumDiff s=new SumDiff();
        s.Sum(a,b);
        s.Difference(a,b);
        int productResult=s.Product(a,b);
        System.out.println("the product of "+a+" and "+b+" is: "+productResult);

    }
    }
