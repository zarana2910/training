package exceptionhand;

public class ExcepHandling {



	public static void main(String[] args) 
	{
		ExcepHandling excepHandling=new ExcepHandling();
		excepHandling.div();
		
		System.out.println("Before Exception");
	    
		try
		{
			int a=6;
			int b=0	;
			int c=a/b;
			System.out.println(c);
		}
	 catch(Exception e)
	 {
		System.out.println("divided by 0 is not possible"); 
	 }
	}
	
	
	void div()
	{
		int a=6;
		int b=2	;
		int c=a/b;
		System.out.println(c);
	  }
  }
  

