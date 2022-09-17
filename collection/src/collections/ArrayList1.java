package collections;
import java.io.*;
import java.util.*;

public class ArrayList1
{
	public static void main(String args[])
	{
     ArrayList arraList=new ArrayList();
     arraList.add(1);
     arraList.add(2.2);
     arraList.add("hello");
     arraList.add('d');
     arraList.add(3);
     
	
     for(int i=0;i<arraList.size();i++)
     {
    	 
		System.out.println(arraList.get(i));
	}

	}
}