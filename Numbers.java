class vritti
{
 void Sum(int a,int b)
 {
  System.out.println("the sum is: "+(a+b));
 }
 void Differnce(int a,int b)
 {
  System.out.println("the differnce is: "+(a-b));
 }
}
    public class Numbers
     {
    public static void main(String[]args)
    {
        int a=6;
        int b=5;
        vritti v=new vritti();
        v.Sum(a,b);
        v.Differnce(a,b);

    }
    }
