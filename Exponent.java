import java.util.Scanner;
class SC
{
    int squares(int n)
    {
     return (n*n);
    }

    int cubes(int n)
    {
     return (n*n*n);
    }
}
public class Exponent
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number: ");
        int number=sc.nextInt();
        SC a=new SC();
        int result1=a.squares(number);
        System.out.println("the square of the number is: "+result1);
        int result2=a.cubes(number);
        System.out.println("the cube of the number is: "+result2);

    }
}
