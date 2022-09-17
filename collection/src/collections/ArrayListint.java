package collections;

import java.util.ArrayList;

public class ArrayListint {
	
		public static void main(String args[])
		{
	     ArrayList arraList=new ArrayList();
	     arraList.add(1);
	     arraList.add(2);
	     arraList.add(3);
	     arraList.add(4);
	     arraList.add(5);
	     System.out.println(arraList);
		
	     for(int i=0;i<arraList.size();i++)
	     {
			System.out.println(i);
		}

	     for (int i=arraList.size()-1;i>=0;i--)     // reverse------------
	     {
	    	 System.out.println(arraList.get(i));
	     }
		}
	}


