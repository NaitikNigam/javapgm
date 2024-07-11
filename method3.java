// variable arguments (varargs)

public class method3
{
    static int sum(int...arr)
    {
     int result=0;
     for(int a:arr)
     {
        result+=a;

     }
     return result;
    }
    public static void main(String args[])
    {
        System.out.println(sum(...array: 3,4));
    }
}