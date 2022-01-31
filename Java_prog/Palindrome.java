package Java_prog;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "vijay";
		String t = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			t = t + a.charAt(i);
			
			
		} 
		System.out.println(t);
		if(a==t)
		{
			System.out.println(a+"is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	

	}

}
