package training;

public class First {
	int a=2;
	int b=4;
	
int num;
	
	
	
	public void sum()
	{int a=3;
	 int b=6;
		int sum;//------------------error
		sum=a+b;
	}
	
	public static void main(String[] args)
	{
	System.out.println("total is=");
	First first=new First();
    System.out.println(first.a);
    first.sum();
	}
}


