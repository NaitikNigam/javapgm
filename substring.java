import java.util.Scanner;
public class substring
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=in.nextLine();
      int len=str.length();
      System.out.println("Enter start index: ");
      int n=in.nextInt();
      if(n<0 || n>=len)
      {
        System.out.println("Invalid Index");
        System.exit(1);
      }
      System.out.println("Enter no. of character to be extracted= ");
      int m=in.nextInt();
      int substringlen=n+m;

      if(m<0 || substringlen>len)
      {
        System.out.println("Invalid no. of character");
        System.exit(1);
      }
      String substr=str.substring(n,substringlen);
      System.out.println("Substring = "+substr);
    }
}
