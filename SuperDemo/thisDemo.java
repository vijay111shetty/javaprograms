package SuperDemo;

import java.util.ArrayList;

public class thisDemo { // this keyword brings the class variable to the method
	int a = 2;
	public void getdata()
	{
		int b = 3;
		int c = b+this.a;
		System.out.println(b);
		System.out.println(this.a);//this is used to call the class variable to the method
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo a=new thisDemo();
		a.getdata();
		ArrayList aa=new ArrayList();
		aa.add("viajty");
		aa.add(2);
		aa.add(false);
		aa.add("vijay:");
		System.out.println(aa.size());

	}
	
	

}
