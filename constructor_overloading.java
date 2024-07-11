//constructor overloading in java

class employee{
   private  int id;
   private  String name;

   public int getid()                       // use of getters
   {
    return id;

   }

   public String getname()
{
    return name;
}
public employee()                            // constructor
{
    id=35;
    name="naitik";
}
public employee(String n_name)
{
    id=34;
    name=n_name;
}
public employee(String n_name,int n_id)
{
    id=n_id;
    name=n_name;
}
}

public class constructor_overloading
{
    public static void main(String[]args)
    {
       // employee obj=new employee();
        //System.out.println(obj.getid());
        //System.out.println(obj.getname());

       // employee obj1=new employee("ritik");
       // System.out.println(obj1.getid());
        //System.out.println(obj1.getname());
        
        employee obj2=new employee("honey",99);
        System.out.println(obj2.getid());
        System.out.println(obj2.getname());

    }
}