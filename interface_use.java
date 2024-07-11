// object of interface cannot be created

//we can not implement a class with the help of multiple abstract classes but we can implement a class with help of multiple iterfacees

// in abstract class it is mandatory to have one method as abstract and remaing can be non abstract but in interfaces all method must be abstracted

interface bicycle
{   int a=67;                 // interface value cannot modified in main class 
    void brake(int decre);
    void speedup(int incre);
}

interface motor
{
    int n=5;
    void pee();
    void see();
}

class cycle implements bicycle,motor
{
    int speed =7;
     public void brake(int decre)        // method should be declared public while implementing interfaces
    {
        speed=speed-decre;
        System.out.println(speed);
    }
    public  void speedup(int incre)
    {
        speed=speed+incre;
        System.out.println(speed);
    }
    public void  pee()
    {
        System.out.println("PEEEEEEEEEEEEEEEE");
    }
    public void see()
    {
        System.out.println("SEEEEEEEEEEEEEEEEEEEE");
    }
}

public class interface_use
{
    public static void main(String args[])
    {
     cycle obj=new cycle();
     obj.brake(5);
      System.out.println(obj.a);
     obj.speedup(7);
     System.out.println(obj.n);
     obj.pee();
     obj.see();
    
    }
}