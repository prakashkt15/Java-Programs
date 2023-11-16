package Collections;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {
public static void main(String[] args) {
	
	HashMap<String, Integer> h = new HashMap<String,Integer>();
	h.put("Prakash", 23);
	h.put("Pradeep", 20);
	h.put("Dinga", 15);
	h.put("Dingi", 16);
	h.put("Dingi1", 16);//will not allow duplicate key,5 allow duplicate value
	
	System.out.println("------Hashmap------");
	for (Entry a : h.entrySet()) {
		System.out.println(a.getKey()+ " "+ a.getValue());
	}
	
	
	LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
	l.put("Prakash", 23);
	l.put("Pradeep", 20);
	l.put("Dinga", 15);
	l.put("Dingi", 16);
	l.put("Dingi33", 16);//will not allow duplicate key,5 allow duplicate value
	
	System.out.println("------LinkedHashmap------");
	for (Entry a : l.entrySet()) {
		System.out.println(a.getKey()+ " "+ a.getValue());
	}
	
	TreeMap<String, Integer> t = new TreeMap<String, Integer>();
	t.put("Prakash", 23);
	t.put("Pradeep", 20);
	t.put("Dinga", 15);
	t.put("Dingi", 16);
	t.put("Dingi66", 16);//will not allow duplicate key,5 allow duplicate value
	
	System.out.println("------TreeMap------");
	for (Entry b : t.entrySet()) {
		System.out.println(b.getKey()+ " "+ b.getValue());
	}
	
}
}
