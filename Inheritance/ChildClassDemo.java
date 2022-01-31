package Inheritance;

public class ChildClassDemo extends ParentClassdemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo a=new ChildClassDemo();
		a.engine();
		a.Engine();
		a.Gear();
		a.color();
		System.out.println(a.name());

	}
	public void engine()
	{
		System.out.println("new Engine");
	
	}
	public void color()
	{
		System.out.println(color);
	}
	private String name()//it can be accessed with in class only out side the class it cannot be accessed
	{
		String a="vijay";
		return a;
	}
}
