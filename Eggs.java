import java.util.Scanner;
class eggg
{
void hello(int number)
{
 System.out.println(number+" are "+(number/12)+" in full dozen and remaining "+(number%12));
}
}
public class Eggs {
    public static void main(String[]args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of eggs");
     int numberOfEggs=sc.nextInt();
     eggg g=new eggg();
     g.hello(numberOfEggs);

    }
}
