   
class abc{ 
    void displayIt(int number)
    {
      System.out.println("the value one time is: "+number);
      

    }
    void displayItTmesTwo(int number)
    {
      System.out.println("the value two times is: "+number*2);
      
    }
    void displayItPlusOneHundered(int number)
    { 
       
      System.out.println("the value plus hundred is: "+(number+100));
     
    }
}
    public class TestMethods 
    {
    public static void main(String[]args)
    {   
        int a=3;
        int b=4;
        abc e=new abc();
        e.displayIt(a);
        e.displayIt(b);
        e.displayItTmesTwo(a);
        e.displayItTmesTwo(b);
        e.displayItPlusOneHundered(a);
        e.displayItPlusOneHundered(b);

    }
}
