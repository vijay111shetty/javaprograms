package Constructor;

public class ParameterizedConstructor {
	public ParameterizedConstructor(int a,int b)
	{
		System.out.println("I am in parameterizedconstructor");
		int c=a+b;
		System.out.println(c);
	}
	public ParameterizedConstructor()
	{
		System.out.println("I am the constructor");
		System.out.println("I will be called automatically");
	}
	public ParameterizedConstructor(String s)
	{
		System.out.println(s+"\tWorld");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor cu=new ParameterizedConstructor(2,3);
		ParameterizedConstructor c=new ParameterizedConstructor();
		ParameterizedConstructor cd=new ParameterizedConstructor("Hello");
				

	}

}
