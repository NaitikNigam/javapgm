class company{
    int a;
    company(int a)
    {
        this.a=a;
    }
    public int get()
    {
        return a;
    }
}

class employee extends company{
    employee( int c)
    {
      super(c);
      System.out.println("Constructor of child class");
    }
}
public class super_use{

public static void main(String args[])
{
   //company obj=new company(4);
   employee obj1= new employee(5);
   System.out.println(obj1.get());
} 
}