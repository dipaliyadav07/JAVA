// SAME as constant characteristics of class from c++
class Final1
{
    public static void main(String arr[])
    {
        final int i = 51;
        Demo obj = new Demo();
        obj.No1++;
        // obj.No2++;
        // obj.No3++;
    }
}

class Demo
{
    public int No1;
    public final int No2 = 11;
    public final int No3;

    public Demo()       // Demo : No2(11), No3(21)
    {
        No1 = 0;
        No3 = 21;       // not allowed in C++
    }
}