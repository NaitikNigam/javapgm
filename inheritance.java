class company
{
    public int id;
    public String name;
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
        id=i;
    }
    public int getid(){
        return id;
    }


}

class employee extends company
{
    public int salary;
    public String desig;
    public void set(String d)
    {
        desig=d;
    }
    public int gets()
{
    return salary;
}
public void  sets(int s)
{
    salary= s;
}
public String get()
{
    return desig;
}
}

public class inheritance
{
    public static void main(String args[])
    {
         employee obj=new employee();
         obj.set("HR");
         System.out.println(obj.get());
         obj.sets(2000);
         System.out.println(obj.gets());
         obj.setname("ravindra");
         System.out.println(obj.getname());
         obj.setid(56);
         System.out.println(obj.getid());


    }
}