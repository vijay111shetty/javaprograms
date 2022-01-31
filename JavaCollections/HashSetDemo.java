package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the only difference between listarray and hashset is that it doesnot allow the duplicate values
				HashSet<String> a=new HashSet<String>();
				a.add("vijay");
				a.add("java");
				a.add("selenium");
				a.add("shetty");
				System.out.println(a);
				a.add("vijay");//not allows the duplicates
				//and remaining methods are same as list
				Iterator<String> i=a.iterator();//to extract on by one
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				
				

	}

}
