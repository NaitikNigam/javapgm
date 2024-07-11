//constructor execute in top to bottom order


class company
{
    company()
    {
        System.out.println("Base class constructor");
    }


    // constructor overloading

    company(int x)
    {
        System.out.println("Base class constructor with overloading = "+x);
    }
}

class employee extends company
{
    employee()
    {
      System.out.println("Derived  class constructor");  
    }

    employee(int x,int y)
    {
        super (x);
        
      System.out.println("Derived  class constructor with overloading "+y);  
    }
}

class childclass extends employee{
    childclass()
    {
        System.out.println("I am a  child class constructor derived from employee class");
    }

    childclass(int x,int y,int z)
    {
        super(x,y);
        System.out.println("child class constructor with overloading "+z);
    }
}

public class constructor_in_inheritance
{
    public static void main(String args[])
    {  
         //company obj1= new company();

         // It will first extends the base class and invoke the constructor of base class then it will invoke constructor of derived class 

       // employee obj=new employee();

       //constructoer with overloading and super keyord
     //  employee obj =new employee(4,9);
      //childclass obj3=new childclass();
       childclass obj2 =new childclass(4,7,9);
    }
}