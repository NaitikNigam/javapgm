// method overloading can be done by changing the numbers of parameters 
// method overloading cannot be done by changing the return type

public class method_overloading
{
    static void logic(int x)
    {
        System.out.println(x);
    }
    static void logic(int x,int y)
    {
        System.out.println(x+y);
    }
    static void logic(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }
    
    public static void main(String args[])
    {
    int a=5;
    int b=6;
    int c=8;
    logic(a);
    logic(a,b);
    logic(a,b,c);
   }
}