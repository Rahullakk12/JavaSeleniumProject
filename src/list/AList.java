package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class AList {
	
	public static void main(String args[]) {
		
	String arr[] = {"Java","Python", "C++"};
	
	List<String> list=new ArrayList<String>();  
	for(String lang:arr){  
	list.add(lang);  
	
	ArrayList<String> ls = new ArrayList<String>();
	ls.add("Rahul");
	ls.add("Hello");
	ls.add("Ne Int");
	
	
	//String
	for(String lData : ls) {
		System.out.println(lData);	
	}
	
	//List Iterator
	ListIterator<String> lst = ls.listIterator();
	while(lst.hasNext()) {
		System.out.println(lst.next());
	}
	
	ls.set(1, "lang");
	
	System.out.println(ls.get(1));
	
	//Sort an Array List 
	
	  Collections.sort(ls);  

	/* Iterator*/
	
	//Converting array to List
	
	
		//Converting List to Array
		
		String a[] = ls.toArray(new String[ls.size()]);
		System.out.println(a.toString());
	
	
	}}}
	
	
