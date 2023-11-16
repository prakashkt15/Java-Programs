package Collections;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		
		Vector v = new Vector();		
		v.add(80);
		v.add("prakash");
		v.add(null);
		v.add(50.26);
		v.add(null);
		v.add(80);
		
		System.out.println(v.capacity());
	}
}
