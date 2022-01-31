package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();//is having many more methods
		a.add("vijay");
		a.add("shetty");
		a.add(0, "selenium");
		a.add("java");
		System.out.println(a.contains("vijay"));
		System.out.println(a);
		a.remove("shetty");
		System.out.println(a);
		System.out.println(a.get(2));
		String[] b= {"vijays","ravi","praveen","raju","pradeep"};
		System.out.println(b.length);
		System.out.println(a.indexOf("vijay"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains("java"));
		a.add("vijay");
		System.out.println(a);
		LinkedList<String> l=new LinkedList<String>();
		l.add("vijay");
		l.addFirst("vinod");
		l.addLast("ad");
		l.removeFirst();
		
	}

}
