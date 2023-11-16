package Collections;

import java.util.ArrayList;

public class RetainAll {
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
		
		//2 arraylist
		ArrayList al1 = new ArrayList();		
		al1.add("pradeep");
		al1.add("Ram");
		al1.add("KT");
		al1.add(80);
		
		System.out.println("------------before-----------");
		System.out.println(al);
		System.out.println(al1);
		
		
		al.retainAll(al1);
		System.out.println("------------after-----------");
		System.out.println(al);
		System.out.println(al1);
		
		
}
}
