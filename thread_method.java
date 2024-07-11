class myth extends Thread
{
    public void run()
    {   
        int i=0;
        while(i<25){

        System.out.println("I am a thread");
        try{
            Thread.sleep(400);                      // to stop from executing for paticular time
            }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        i++;
        }
    }
}

class myth1 extends Thread
{
    public void run()
    {   
        int i=0;
        while(i<25){

        System.out.println("I am a new thread");

        i++;
        }
    }
}

public class thread_method
{
    public static void main(String args[])
    {
    myth obj=new myth();
    myth1 obj1=new myth1();

    obj.start();
    /*try{

    obj.join();                     // this method is used to run myth thread first and then myth1 after completion of myth
    }
    catch(Exception e)
    {
        System.out.println(e);
    }*/
    obj1.start();

    }
}