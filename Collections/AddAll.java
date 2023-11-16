package Collections;

import java.util.ArrayList;

public class AddAll {
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

		//addall(collection c)
		al.addAll(al1);
		System.out.println("-----add(obj element)-----");
		System.out.println(al);
		System.out.println("-----addall(Collection c)-----");
		System.out.println(al1);
		
		//addall(int index,Collection c)
		al.addAll(1, al1);
		System.out.println("-----add(obj element)-----");
		System.out.println(al);
		System.out.println("-----(int index,Collection c)-----");
		System.out.println(al1);
		
		
	}
}
