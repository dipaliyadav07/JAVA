class Demo		//class Demo extends Object
{
	public static void main(String arr[])
	{
		System.out.println("Inside main function");

		Maths mobj1 = new Maths();
		Maths mobj2;
		mobj2 = new Maths(10,11);

		int iRet = 0;
		iRet = mobj1.Addition();
		System.out.println("Addition is : "+iRet);

		iRet = mobj2.Addition();
		System.out.println("Addition is :"+iRet);
	}
}
class Maths			//class Maths extends object
{
	public int iNo1;		//characteristics
	public int iNo2;		//characteristics

	public Maths()			//default constructor
	{
		System.out.println("Inside default constructor");
		iNo1 = 0;
		iNo2 = 0;
	}
	public Maths(int a, int b)		//parameterised constructor
	{
		System.out.println("Inside parameterised constructor");
		iNo1 = a;
		iNo2 = b;
	}
	public int Addition()			//behaviour
	{
		int iAns = 0;
		iAns = iNo1 + iNo2;
		return iAns;
	}
	public int Substraction()		//behaviour
	{
		int iAns = 0;
		iAns = iNo1 - iNo2;
		return iAns;
	}
}//End of class Maths