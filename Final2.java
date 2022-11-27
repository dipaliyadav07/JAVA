class Final2
{
    public static void main(String arr[])
    {
        Base bobj = new Derived(); 
    }
}
class Base 
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public final void gun()
    {
        System.out.println("Base gun")
    }
}
class Derived
{
    public void fun()
    {
        System.out.println("Derived fun");
    }
    public void gun()    //will give error as th gun function in Base class is final so we cant override it
    {
        System.out.println("Derived gun")
    }
}