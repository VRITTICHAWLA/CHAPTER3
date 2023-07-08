class Stu
{
    int idno,CreditHours,Points;
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
    public class Student {
    public static void main(String[]args)
    {
        Stu s=new Stu();

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