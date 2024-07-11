//java method with creating object

import java.util.Scanner;
public class method_with_obj
{    
    int logic( int x,int y)
    {
        if(x>y)
        return x+y;
        else
        return x*y;
    }
    public static void main(String args[])
    {
        int a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the first number= ");
     a=sc.nextInt();
     System.out.print("Enter the second number= ");
     b=sc.nextInt();
     method1 obj=new method1();
     c=obj.logic(a,b);
     System.out.print("Result= "+c);
    }
}