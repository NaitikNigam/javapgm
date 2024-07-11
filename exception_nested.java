import java.util.Scanner;

public class exception_nested
{
    public static void main(String args[])
    {
     Scanner sc =new Scanner(System.in);
     int arr[]=new int [3];
     arr[0]=56;
     arr[1]=99;
     arr[2]=13;
     
     System.out.println("Enter the value of index =");
     int ind=sc.nextInt();

     try
     {
         System.out.println(" Nested try-catch");

         // Nested try- catch block

         try{
         System.out.println("value at enterd index= "+arr[ind]);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
             System.out.println("Index enterd have no value");
             System.out.println("Exception in level 2");  
         }
     }

     catch(Exception e)
      {
        System.out.println("Some exception occured");
        System.out.println("Exception in level 1");
      }

    }
}