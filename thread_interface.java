class myth implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<25)
        {
        System.out.println("Runnable interface");
        i++;

        }
    }
}

class myth1 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<25)
        {
        System.out.println("Runnable 222222222 interface");
        i++;

        }
    }
}

public class thread_interface
{
    public static void main(String args[])
    {
     myth bullet =new myth();
     Thread gun=new Thread(bullet);

     myth1 bullet1=new myth1();
     Thread gun1=new Thread(bullet1);
     gun.start();
     gun1.start();
    }
}
