/*types of error--> syntax error
                    logical error
                    runtime error/ Exception */


import java.util.Scanner;

class error_example
{
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);

     /* syntax error
      int a=9
      System.out.printLn(a);*/


     /*logical error
     program to find prime numbers till 10

     System.out.println(2);
     for(int i=1;i<5;i++)
     {  
        System.out.println("Prime Number= "+(2*i+1));
     }*/

     /* runtime error
     System.out.println("Enter a number= ");
     int a=sc.nextInt();   // if we enter 0 here then it will show arithmetic exception
     int b=1000/a;   
     System.out.println("Integer part of 1000 after division= "+b);*/

    }
}