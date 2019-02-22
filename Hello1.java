import java.io.*;
public class Hello1
{
	static String s;
	public static void display()
	{
		System.out.println(s);
	}
	Hello1(String s1)
	{
	s=s1;
	System.out.println("This is parameterised constructor");
	}
	public static void main(String args[]) throws IOException
	{
		Hello1 h=new Hello1("Hello this is the passed string");
		h.display();
	}
}