// constructor in java

class employee
{
     private int id;
   private  String name;
    
    public employee()
    {
        id=45;
        name="Naitik";
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
}
public class constructor
{
    public static void main(String []args)
    {
        employee obj=new employee();
        System.out.println(obj.getid());
        System.out.println(obj.getname());
    }
}