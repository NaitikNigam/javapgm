import java.util.Scanner;
public class extract_string
{
 public static void main(String args[])
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("Enetr the string");
  String str=sc.nextLine();
  int strlen=str.length();
  System.out.println("enetr the start index");
  int n=sc.nextInt();
  if(n<0 || n>=strlen)
  {
    System.out.println("Invalid Index");
    System.exit(1);
  }
  System.out.println("Enter the character to be extracted");
  int m=sc.nextInt();
  int substrlen=n+m;
  if(m<0 || substrlen>strlen)
  {
   System.out.println("Invalid no.of character");
   System.exit(1);
  }
  String substr=str.substring(n,substrlen);
  System.out.println("Substring = "+substr);

  

 }
}