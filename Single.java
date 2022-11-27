
class Single
{
	public static void main(String arg[])
	{
		// Base bobj1 = new Base();			// no casting
		// Derived dobj1 = new Derived();		// no casting
		   Base bobj2 = new Derived();			// upcasting
		// Derived dobj2 = new Base();		// downcasting(not allowed)

		bobj1.fun();	//Base fun
		bobj1.fun(11);	//Base fun
		bobj1.gun();	//Derived gun
		// bobj1.sun();	//Derived sun
	}
}

/* 
class Object
{
	// Code
}
*/

class Base	// Class Base extends Object
{
	public int A,B;
	public Base()
	{
		System.out.println("Base constructor");
		this.A = 10;
		this.B = 20;
	}
	public void fun()	//Defination
	{
		System.out.println("Inside Base Fun");
	}
	public void gun()	//Defination
	{
		System.out.println("Inside Base Gun");
	}
	public void fun(int No)		//overloaded defination
	{
		System.out.println("Inside Base fun with one integer");
	}
}

class Derived extends Base		//class Derived : public Base
{
	public int X,Y;
	public Derived()
	{
		System.out.println("Derived constructor");
		this.X = 30;
		this.Y = 40;
	}
	public void sun()	//Defination
	{
		System.out.println("Inside Derived sun");
	}
	public void gun()	//Overrided Defination
	{
		System.out.println("Inside Derived Gun");
	}

}