// abstract class and method
//we can not make object of abstract class 

//we can not implement a class with the help of multiple abstract classes but we can implement a class with help of multiple iterfacees

// in abstract class it is mandatory to have one method as abstract and remaing can be non abstract but in interfaces all method must be abstracted

abstract class base
{
   abstract public void display();         // if we declare any method as abstract then we have to make whole 
                                            //--class as abstract
}

class derived extends base{                       //concrete class -- all methods of abstract class are coded and new method can also be added
  public void display()                           //formation of concrete class is must in order to make object
  {                                               // in concrete class it is must to write code of all methods  
    System.out.println("I am a display method");  //-- defined in abstarct parent class
  }
}

abstract class derived1 extends base{              // without override extending the abstract class
    public void display()
    {
        System.out.println(" I am a dis mathod");
    }
}

public class abstract_use 
{
    public static void main(String [] args)
    {
        derived obj=new derived();
        obj.display();
        
    }
}