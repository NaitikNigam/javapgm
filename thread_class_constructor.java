// getId(),  getName()---> Methods

// Thread(String Name)  ,  Thread()  ,Thread(Runnable r), Thread(String Name,Runnable r)--> Thread class constructor

class myth extends Thread
{
    public myth(String name)              // assingning thread name
    {
        super(name);
    }

    public void run()
    {   int i=0;
        while(i<15)
        {
        System.out.println("I am Thread");
        i++;
        }

    }
}

public class thread_class_constructor
{
    public static void main(String args[])
    {
         myth obj=new myth("naitik");
         myth obj1=new myth("Ritik");
         obj.start();
         obj1.start();
         System.out.println("Thread Name: "+obj.getName());        // Name of thread
         System.out.println("Thread Id: "+obj.getId());            // Id of thread
         System.out.println("Thread Name: "+obj1.getName());        
         System.out.println("Thread Id: "+obj1.getId());
    }
}