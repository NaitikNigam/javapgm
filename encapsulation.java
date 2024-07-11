class encapsulation_class
{
    private String name;
    private int age;
    public String getname()
    {
        return name;    
    }
    public int getage()
    {
        return age;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int age)
    {
        this.age=age;
    }
}
public class encapsulation
{
   public static void main(String args[])
   {
    encapsulation_class obj=new encapsulation_class();
    obj.setname("naitik");
    obj.setage(23);
    System.out.println("Age:"+(obj.getage()));
    System.out.println("Name:"+(obj.getname()));
   }
}