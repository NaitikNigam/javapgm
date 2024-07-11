// thread class is in java.lang package

class myth extends Thread
{
   public void run()
   { 
    int i=0;
    while(i<50)
    {
        System.out.println("myth");
        i++;
    }
   }
}

class myth1 extends Thread
{
   public void run()
   {
    int i=0;
    while(i<50)
    {
        System.out.println("myth1");
        i++;
    }
   
    }
}
 public class thread_class
 {
    public static void main(String args[])
    {
        myth obj=new myth();
        myth1 obj1=new myth1();
        obj.start();                //start method will internally call run method so there is no need to write run method 
        obj1.start();               // this is written in thread.java class
    }
 }

