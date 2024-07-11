class company
{
    public void display()
    {
        System.out.println("naitik Nigam");

    }
}
class employee extends company{
   // @override
    public void display()
    {
        System.out.println("Ritik nigam");
    }
}
 public class method_overriding
 {
    public static void main(String args[])
    {
        employee obj =new employee ();
        obj.display();
    }
 }