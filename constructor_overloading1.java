public class constructor_overloading1
{    
    public constructor_overloading1()
    {
        System.out.println("This is a default constructor");
    }
    public constructor_overloading1(String message)
    {
        System.out.println("This is a default constructor with message:"+message);
    }
    public static void main(String args[])
    {
      constructor_overloading1 obj =new constructor_overloading1();
      constructor_overloading1 obj1 =new constructor_overloading1("hello Naitik");

    }
}