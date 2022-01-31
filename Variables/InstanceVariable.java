package Variables;
/*
public class InstanceVariable {
	String name;//Instance variables
	String address;
	String city;
	
	public InstanceVariable(String name, String address, String city)
	{
		this.name=name;
		this.address=address;
		this.city=city;
	}
	
	public void getdata()
	{
		System.out.println(name+address+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable a=new InstanceVariable("vijay","shetty","banglore");
		a.getdata();
		

	}

}
*/
/*
public class InstanceVariable {
	String name;//Instance variables
	String address;
	static String city = "banglore"; //class variable  Static variables
	static int i=0;
	
	public InstanceVariable(String name, String address)
	{
		this.name=name;
		this.address=address;
		int e=10;//local variables
		i++;
		System.out.println(i);
	}
	
	public void getdata()
	{
		System.out.println(name+address+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable a=new InstanceVariable("vijay","shetty");
		InstanceVariable b=new InstanceVariable("raju","shetti");
		a.getdata();
		b.getdata();
		

	}

}
*/
public class InstanceVariable {
	String name;//Instance variables
	String address;
	static String city = "banglore"; //class variable  Static variables
	static int i;
	static 
	{int i=0;
	}
	public InstanceVariable(String name, String address)
	{
		this.name=name;
		this.address=address;
		int e=10;//local variables
		i++;
		System.out.println(i);
	}
	public static void getcity()//static method  and static method on;ly accepts only static variables
	{
		System.out.println(city);
	}
	public void getdata()
	{
		System.out.println(name+address+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable a=new InstanceVariable("vijay","shetty");
		InstanceVariable b=new InstanceVariable("raju","shetti");
		a.getdata();
		b.getdata();
		InstanceVariable.getcity(); //static methods are called by using class name
		

	}
}
