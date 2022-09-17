package collections;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class ArrayListGen {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		System.out.println("max value is " +Collections.max(arrayList));
		System.out.println("min value is " +Collections.min(arrayList));

		for(int i:arrayList) 
		{
			System.out.println(i);
		}
	}

}
