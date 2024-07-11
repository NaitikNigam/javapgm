// java static method

public class method_static
{
    static int logic(int x,int y)
    {
        if(x>y)
        return x+y;
        else
        return x*y;
    }
    public static void main(String args[])
    {
      int a=7;
      int b=5;
      int c= logic(a,b);
      System.out.print("value= "+c);
    }
}