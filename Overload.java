public class Overload
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

	public static void main(String args[])
	{
		Overload O=new Overload();
		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		int a=10,b=20;
		double c=10.10,d=20.20;
		O.sum(a,b);
		O.sum(c,b);
		O.sum(c,d);
		O.sum('a','b');
	}

}