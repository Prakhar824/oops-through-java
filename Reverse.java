import java.io.*;
public class Reverse {
	
	public static int rev(int a )
	{
		int b =a,n,reverse=0;
		while(b!=0)
		{
			n=b%10;
			b/=10;
			reverse=reverse*10+n;
		}
		return reverse;
	}
	public static void main(String args[]) throws IOException
	{
		Reverse r=new Reverse();
		int n=r.revd(1024);
		System.out.println("the reversed no. is"+n);
	}

}