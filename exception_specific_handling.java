import java.util.Scanner;

public class exception_specific_handling
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int arr[]= new int[3];
     arr[0]=55;
     arr[1]=45;
     arr[2]=89;

     System.out.println("Enter the index on which you want divide operation ");
     int a= sc.nextInt();
     System.out.println("Enter the value through which you want divide operation ");
     int b= sc.nextInt();

     try{
        System.out.println("the value at array index is "+arr[a]);
        System.out.println("the result after division is = "+arr[a]/b);  

        }

       catch(ArithmeticException e)
      {
        System.out.println("Arithmetic exception occured");
        System.out.println(e);
      }
        
       catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Array index out of bound exception occured");
        System.out.println(e);
      }

      catch(Exception e)
      {
        System.out.println("Some  other exception occured");
        System.out.println(e);
      }

    }
}