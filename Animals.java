class Cat
{
	void meaw()
	{
		System.out.println("Cat produces meaw sound");
		System.out.println("Cat do cat walk");
	}
}
class Dog extends Cat
{
	void bhau()
	{
		System.out.println("Dog produces bhau sound");
		System.out.println("Dog walk with four legs");
	}
}
class Cow extends Dog
{
	void maww()
	{
		System.out.println("Cow produces maww sound");
		System.out.println("Cow moves slowly");
	}
}
public class Animals extends Cow
{
	public static void main(String args[])
	{
		System.out.println("This is class animals and this contains properties of all animals");
		Animals A=new Animals();
		A.meaw();
		A.bhau();
		A.maww();
	}

}