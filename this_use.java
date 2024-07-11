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
public class this_use{

public static void main(String args[])
{
   company obj=new company(4);
   System.out.println(obj.get());
} 
}