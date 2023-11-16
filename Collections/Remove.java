package Collections;

import java.util.ArrayList;

public class Remove {
	public static void main(String[] args) {
		//1 arraylist
				//add(obj element)
				ArrayList al = new ArrayList();		
				al.add(80);
				al.add("prakash");
				al.add(null);
				al.add(50.26);
				al.add(null);
				al.add(80);
				
				//remove(Object obj)
				al.remove(50.26);
				System.out.println(al);
				
				//remove(int index)
				al.remove(2);
				System.out.println(al);
				
				
				
	}
}
