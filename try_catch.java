// exception class is in java.lang package

import java.util.Scanner;

public class try_catch
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int a=sc.nextInt();
  System.out.println("Enter the second number");
  int b=sc.nextInt();

  try
    {
    int c=a/b;
    System.out.println("Result= "+c);
    }
  catch(Exception e)
  {
    System.out.println("Failed to divide Reason= ");
    System.out.println(e);     // e prints the reason that why execution does not happend
  }
  finally
  {
    System.out.println("End of program");
  }  

  }
}