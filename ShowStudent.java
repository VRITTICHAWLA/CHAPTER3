class Student
{
 int idno,CreditHours,Points;
    Student()
    {
        idno=9999;
        CreditHours=12;
        Points=3;

    }
    public void setIdNo(int idno)
    {
        this.idno=idno;
    }
    public  void setCreditHours(int CreditHours)
    {
        this.CreditHours=CreditHours;
    }

    public void setPoints(int Points)
    {
        this.Points=Points;
    }
    public int getIdNo()
    {
        return idno;
    }
    public int getCreditHours()
    {
        return CreditHours;
    }

    public int getPoints()
    {
       return Points;
    }
     public int Average()
    {
        int average=this.Points/this.CreditHours;
        return average;
    }

}
public class ShowStudent {
    public static void main(String[]args)
    {
     Student s= new Student();
    

      s.setIdNo(1);
      s.setPoints(150);
      s.setCreditHours(5);
     int av=s.Average();
     System.out.println("id no: "+s.getIdNo());
     System.out.println("points: "+s.getPoints());
     System.out.println("credit hours: "+s.getCreditHours());
     System.out.println("grade point average: "+av);
    }
}
