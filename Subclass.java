class Inheritance
{
	void sum(int a ,int b)
	{
		System.out.println("Sum of two integers is:"+(a+b));
	}

	void sum(int a, float b)
	{
		System.out.println("Sum of a integer and a float is:"+(a+b));
	}

	void sum(double a, double b)
	{
		System.out.println("Sum of two float values is:"+(a+b));
	}

	void sum(char a, char b)
	{
		System.out.println("Two passed characters are:"+a+b);
	}
}

public class Subclass extends Inheritance
{
	public static void main(String args[])
	{
		Subclass S=new Subclass();
		int a=10,b=20;
		double c=10.10,d=20.20;
		S.sum(a,b);
		S.sum(c,b);
		S.sum(c,d);
		S.sum('a','b');
	}

}