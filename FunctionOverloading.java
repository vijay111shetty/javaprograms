
public class FunctionOverloading {
	//different methods have same name
	//either argument count should be different or
	//argument data type should be different
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, String b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading a=new FunctionOverloading();
		a.getData(2);
		a.getData("vijay");
		a.getData(3, "vijay");
	}

}
