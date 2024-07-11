// implementation of both inheritance and interface in one class
// default method use

interface camera
{
    void snap();
    void insta();
    
    default void video()                       // it can be override in the class which implements it
    {                                          // there is no need of writing its code in extended classes
       
        System.out.println("hedgfjhdhfhdf");
    }

}

interface wifi
{
   // String[] net();
    void connect(String network);

}

class phone
{
    void num(int number)
    {
        System.out.println("Phone Number= "+number);
    }
}

class company extends phone implements camera,wifi
{
    public void snap()
    {
       System.out.println("Take a snap");
    }

    public void insta()
    {
        System.out.println("Take a reel");
    }
      /*public string[] net()
     {
        return net_name;
     }*/

     public void connect(String network)
     {
        System.out.println("------"+network);
     }
}

public class inheritance_use_interface_use{
    public static void main(String args[])
    {
        company obj=new company();
        obj.snap();
        obj.insta();
        obj.connect("yoyo");
        obj.num(12345);
        obj.video();
      
    }
}