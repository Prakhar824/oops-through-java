import java.io.*;
public class Fourth
{
	int a ,b ;
	public void sum()
	{
		System.out.println("Sum is "+(a+b));
	}
	Fourth(int x,int y)
	{
	a=x;
	b=y;
	System.out.println("This is parameterised constructor");
	}
	Fourth()
	{
	a=10;
	b=20;
	System.out.println("This is default constructor");
	}
	public static void main(String args[]) throws IOException
	{
		Fourth obj1=new Fourth(40,50);
		obj1.sum();
		Fourth obj2=new Fourth();
		obj2.sum();
	}
}