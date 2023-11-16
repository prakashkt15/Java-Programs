package Collections;

import java.util.ArrayList;

public class Size {
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
		
		System.out.println(al.size());
		
		System.out.println("---------To print in sequential order------------");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
