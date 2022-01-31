package SuperDemo;

public class ChildDemo extends ParentDemo{
	String name="Shettisadavarti";
	public ChildDemo()
	{
		super();
		System.out.println("I am in the child class constructor");
	}
	public void getData()
	{
		super.getData(); //methods in the child and parent class are same then to invoke the method of parent class we have to use the super keyword
		System.out.println("I am in the child class get data");
	}
	public void getStringdata()
	{
		System.out.println(name);
		// when the saMe variable is defined with same name then to call it in the child class we have to use the super kerword
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd=new ChildDemo();
		cd.getData();
		cd.getStringdata();

	}

}
