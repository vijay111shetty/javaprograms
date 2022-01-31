package Java_prog;

import java.util.Scanner;

public class natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number upto which you want to print numbers");
		int a=sc.nextInt();
		//for(int i=0;i<=a;i++) {
			//System.out.println(i);
			
	//	}
		int e=0;
		while (a>=0) {
			
			System.out.println(e);
			e=e+1;
			a=a-1;
		}
			
		
	}

}
