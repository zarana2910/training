package inheritance;

public class Sub extends Super{

	public static void main(String[] args) 
	{
		Sub sub=new Sub();
		System.out.println(sub.a);
		sub.super2();
			
	}

	void sub()
	{
		System.out.println("this is sub mathod from sub class");
	}
}
