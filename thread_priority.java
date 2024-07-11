class myth extends Thread{
    public myth(String name)
    {
        super(name);
    }

    public void run()
    {
        int i=0;
        while(i<15)
        {
            System.out.println("I am a thread "+this.getName());
            i++;
        }
    }
}
public class thread_priority
{
    public static void main(String args[])
    {
        myth obj1=new myth("Naitik");
        myth obj2=new myth("Ritik");
        myth obj3=new myth("Yash");
        myth obj4=new myth("Ram");
        myth obj5=new myth("Raj");

        obj5.setPriority(Thread.MAX_PRIORITY);
        obj4.setPriority(Thread.MIN_PRIORITY);
        obj3.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.setPriority(Thread.MIN_PRIORITY);
        
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
    }
}