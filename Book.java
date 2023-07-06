

class Books
{
  private String Title;
  private int NoOfPages;
  public void setTitle(String t)
  {
   Title=t;
  }
  public void setnoOfPages(int n)
  {
    NoOfPages=n;
  }
  public String getTitle()
  {
   return Title;
  }
  public int getNoOfPages()
  {
   return NoOfPages;
  }
}
class TextBook
{
    private int GradeLevel;
    public void setGradeLevel(int g)
    {
        GradeLevel=g;
    }
    public int getGradeLevel()
    {
        return GradeLevel;
    }

}  


public class Book {
    public static void main(String[]args)
    {
      Books b=new Books();
      b.setTitle("Dark Love");
      b.setnoOfPages(350);
      TextBook tb=new TextBook();
      tb.setGradeLevel(13);
      System.out.println("the title of the book is: "+b.getTitle());
      System.out.println("No of pages in the book is: "+b.getNoOfPages());
      System.out.println("the grade level of the book is: "+tb.getGradeLevel());
      

    }
    
}
