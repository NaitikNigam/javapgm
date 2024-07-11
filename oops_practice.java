class employee
{
    int salary;
    String name;
    public int getsalary()
    {
      return salary;
    }
    public String getname()
    {
      return name;
    }
    public void setname( String n)
    {
       name=n;
    }
}
public class oops_practice
{
    public static void main(String args[])
    {
      employee obj =new employee();
      obj.setname("naitik");
      System.out.println(obj.getname());
      obj.salary=12000;
      System.out.println(obj.getsalary());
    }
}