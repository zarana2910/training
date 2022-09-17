package sleepmeth;

public class SleepMeth extends Thread
{
@Override
public void run()
{
	for(int i=1;i<10;i++)
	{
	System.out.println(i);
	try {
		this.sleep(1000);
	} catch (InterruptedException e)
	{
		
		e.printStackTrace();
	}
}
	
}
public static void main(String[] args) 
{
	SleepMeth sleepMeth=new SleepMeth();
	sleepMeth.start();
}
}
