import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class abcd {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//System.out.println(add(1,2));
		HashSet<Integer> a=new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(1);
		System.out.println(a);
		Iterator<Integer> i=a.iterator();	
		System.out.println(i.next());
		HashMap<String,String> t=new HashMap<String,String>();
		t.put("vijay", "shetty");
		t.put("vinod", "shetty");
		t.put("siddu", "shety1");
		System.out.println(t);
		ArrayList<String> e=new ArrayList<String>();
		e.add("viajy");
		e.add("vinod");
		e.add("ddd");
		System.out.println(e);

		int b=10;
		++b;
		System.out.println(b);
		b++;
		System.out.println(b);
		System.out.println(b++ + b++);//12+1
		System.out.println(10*10/5+3-1*4/2); 
	}
	 /*public static void main(String[] args)  
	    {  
	        // Let's print the classloader name of current class.   
	        //Application/System classloader will load this class  
	        Class c=abcd.class;  
	        System.out.println(c.getClassLoader());  
	        //If we print the classloader name of String, it will print null because it is an  
	        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
	        System.out.println(String.class.getClassLoader());  
	    }  */
	
	
	
	
	 

}
