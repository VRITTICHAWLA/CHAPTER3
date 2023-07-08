class Student
{
 int idno,CreditHours,Points;
    Student()
    {
         idno=9999;
         CreditHours=12;
         Points=3;
    }
    void show()
    {
    System.out.println("id no: "+idno);
     System.out.println("points: "+Points);
     System.out.println("credit hours: "+CreditHours);
     System.out.println("grade point average: "+(Points/CreditHours));
    }
   
    

}
public class ShowStudent2 {
    public static void main(String[]args)
    {
     Student s= new Student();
     s.show();
    

   
    }
}
