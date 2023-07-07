class PZ
{
 private String toppings;
 private int diameter;
 private double price;
 public void settoppings(String t)
 {
  
toppings=t;
 }
 public void setdiameter(int d)
 {
    diameter=d;
 }
 public void setprice(int p)
 {
    price=p;
 }
 public String gettoppings()
 {
   return toppings;
 }
 public int getdiameter()
 {
    return diameter;
 }
 public double getprice()
 {
    return price;
 }

}

    public class Pizza 
{
    public static void main(String[]args)
    {
    PZ p=new PZ();
    p.settoppings("chilli sauce");
    p.setprice(230);
    p.setdiameter(5);
    System.out.println("the toppings are: "+p.gettoppings());
        System.out.println("the toppings are: "+p.getprice());
            System.out.println("the toppings are: "+p.getdiameter());


    
    }
}
