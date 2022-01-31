package JAVA_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;
;

public class Test1 {
	/*
	 * @Test public static void main(String[] args) { // TODO Auto-generated method
	 * stub ArrayList<String> names=new ArrayList(); names.add("Arjun");
	 * names.add("Arvind"); names.add("Akshata"); names.add("Vijay");
	 * names.add("name"); names.add("Arati"); int count=0; 
	 *  for (int
	 * i=0;i<names.size();i++) { String actualname = names.get(i);
	 * if(actualname.startsWith("A")) { count++; } } System.out.println(count);
	 * 
	 * }
	 */
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList();
		names.add("Arjun");
		names.add("Arvind");
		names.add("Akshata");
		names.add("Vijay");
		names.add("name");
		names.add("Arati");
		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		long cun= Stream.of("vijay","arjun","arvind","Akashata","name").filter(s->
		{
			s.startsWith("A");
			return true;
			
		}).count();
		System.out.println(cun);
		//Lambda methods will helps to reduce the code
		names.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//only to print the singlevalue by using limit
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
		Stream.of("vijay","amruta","arjun","akshata","arvind","rajua").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		List<String> nameas=Arrays.asList("arjun","arvind","vijay","amruta","arun","azx");
		//to convert to uppercase and sort
		nameas.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String> nameas1=Arrays.asList("siddu","ankita","vinuta","arif","mallu","kiran");
		// to merge two lists
		Stream<String>name1=Stream.concat(nameas.stream(), nameas1.stream());
		//name1.sorted().forEach(s->System.out.println(s));
		boolean flag=name1.anyMatch(s->s.equalsIgnoreCase("vijay"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		List<String> l1=Stream.of("vijay","amruta","arjun","akshata","arvind","rajua").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(l1.get(0));
		List<Integer> values=Arrays.asList(1,2,3,9,87,65,44,3,56,78,43,3,21,3,2,1);
		//print the unique numbers from the list
		//sort the array
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> res=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(res);
		System.out.println(res.get(2));
	}
	public  void Streamcollect()
	
	{
		List<String> l1=Stream.of("vijay","amruta","arjun","akshata","arvind","rajua").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(l1.get(0));
		List<Integer> values=Arrays.asList(1,2,3,9,87,65,44,3,56,78,43,3,21,3,2,1);
		//print the unique numbers from the list
		//sort the array
		values.stream().distinct().forEach(s->System.out.println(s));
		//sort the array and print the value in the third index
		List<Integer> res=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(res);
	}
}
