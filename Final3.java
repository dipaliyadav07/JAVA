class Final3
{
    public static void main(String arr[])
    {
        Base bobj = new Derived();
    }
}
final class Base
{

}
class Derived extends Base  //this will generate error as we cant inherit final class
{

}