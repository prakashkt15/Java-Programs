package Collections;

import java.util.ArrayList;

public class Add {
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
		
		System.out.println("-----add(obj element)-----");
		System.out.println(al);
		
		//add(int index,obj element)
		al.add(2, 'T');
		System.out.println("----add(int index,obj element)-----");
		System.out.println(al);
		
	}
}
