class Pizza {
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


public class TestPizza {
    public static void main(String[] args) {
        Pizza p = new Pizza();

        p.setdiameter(5);
        p.setprice(275);
        p.settoppings("extra cheese");

        System.out.println("The price of the pizza is: " + p.getprice());
        System.out.println("The diameter of the pizza is: " + p.getdiameter());
        System.out.println("The toppings of the pizza is: " + p.gettoppings());
    }
}