package Inheritance;


public class ChildClassDemo1 extends ParentClassdemo1{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo1 a=new ChildClassDemo1();
		a.engine();
		a.Engine();
		a.Gear();
		a.color();
		a.SoundSystem(); //method overriding

	}
	public void engine()
	{
		System.out.println("new Engine");
	
	}
	public void color()
	{
		System.out.println(color);
	}
	public void SoundSystem()
	{
		System.out.println("new sound system");
	}
}
