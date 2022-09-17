package inheritance;

public class Multilevel extends Sub{

	public static void main(String[] args)
	{
		Multilevel multilevel=new Multilevel();
		System.out.println(multilevel.a);
		multilevel.super2();
		multilevel.sub();
		}

}
