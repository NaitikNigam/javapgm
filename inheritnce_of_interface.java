// inheritance of interface

interface company{
    void meth1();
    void meth2();

}

interface employee extends company
{
    void meth3();
    void meth4();
}

class skill implements employee{
    public void meth1()
    {
        System.out.println("Meth1");
    }
    public void meth2()
    {
        System.out.println("Meth2");
    }
    public void meth3()
    {
        System.out.println("Meth3");
    }
    public void meth4()
    {
        System.out.println("Meth4");
    }
}

public class inheritnce_of_interface
{
    public static void main(String args[])
    {
        skill obj =new skill();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}