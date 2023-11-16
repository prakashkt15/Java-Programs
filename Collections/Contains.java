package Collections;

import java.util.ArrayList;

public class Contains {
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
		
		System.out.println(al.contains(null));
	}
}
