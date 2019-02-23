import java.io.*;
public class Swap
{
	int a=10,b=20,c=0;
	public static void main(String[] args)throws IOException
{
		Swap s = new Swap();
		s.c=s.a;
		s.a=s.b;
		s.b=s.c;
		System.out.println("a = "+s.a);
		System.out.println("b = "+s.b);
	}
}