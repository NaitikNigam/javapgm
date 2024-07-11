// we can make object of an interface using the class which implements it but it should be remembered that particular iterface object can access only the methods of that interface and not of other interface or the class implementing it

interface camera 
{
    void camera();
    void insta();
}

interface wifi
{
    void connect();
}

class company 
{   void message()
{
    System.out.println(" class company");

}
}

class emp extends company implements camera,wifi{
    public void camera()
    {
      System.out.println("I am a camera");  
    }

    public void insta()
    {
      System.out.println("I am a insta");  
    }
    public void connect()
    {
      System.out.println("I am a connect");  

    }
    public void song()
    {
      System.out.println("I am a song");  

    }

}

public class polymorphism_use
{
  public static void main(String args[])
  {
    //emp obj=new emp();
     camera obj=new emp();     //here it allows only camera's methods to be used
     obj.camera();             // we can only use the method of camera interface
  }
}