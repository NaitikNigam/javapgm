// creating custom(own) class 

class employee
{
    int id;
    String name;
    public void printdetails()
    {
        System.out.println("id= "+id);
        System.out.println("Name= "+name);
    }
}

public class custom_class
{
    public static void main(String arga[])
    {
      employee harry=new employee();
      employee john=new employee();
      harry.id=12;
      harry.name="harry";
      john.id=13;
      john.name="john";
      harry.printdetails();
      john.printdetails();
    }
}