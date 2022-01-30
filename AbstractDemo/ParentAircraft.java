package AbstractDemo;

public abstract class ParentAircraft {

	public void Engine()
	{
		System.out.println("impement the engine methods");
	}
	public void safetyManual()
	{
		System.out.println("impement the saftey manual");
	}
	public abstract void color();
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
}
