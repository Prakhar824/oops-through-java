class Factorial{
int fact()
{
int a=5;
int n=1;
while (a>0)
{
n=n*a;
a --;
}
return n;
}
public static void main(String[] args )
{
Factorial ob=new Factorial();
System.out.println("factorial of 5 is "+
ob.fact());
}
}