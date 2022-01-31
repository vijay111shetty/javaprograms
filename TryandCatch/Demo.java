package TryandCatch;

public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=0;
		try
		{
			int c=a/b;
		}
		//one try block can contains many number of catch blocks
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
		//if the exception is specific then it will go there and skips the remaining
		catch (Exception e)
		{//exception is general type of exception
			System.out.println(e);
		}
		finally
		{
			System.out.println("it should be executed what ever may happen in the code it may pass or fails");
		}
	}

}
