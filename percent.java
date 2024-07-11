import java.util.Scanner;
class percent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        float a,sum=0.0f,f;
        for(i=1;i<=5;i++)
        {
            System.out.print(" Enter the marks of "+i+ " subject: ");
            a=sc.nextInt();
            sum+=a;
        }
        f=sum/5.0f;
         System.out.print("percent= "+f);
    }

}