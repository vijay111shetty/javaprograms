package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is a combition of key value pair
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(0,"vijay");
		hs.put(1, "selenium");
		hs.put(2, "shetty");
		System.out.println(hs.get(0));
		Set sn= hs.entrySet();//converting map to set
		Iterator it=sn.iterator();
		//HashTable--pass table set collections
		while (it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
			

	}

}
