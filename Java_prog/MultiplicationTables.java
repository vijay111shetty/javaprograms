package Java_prog;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int b=sc.nextInt();
		for (int i=1;i<=b;i++)
		{
			for (int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}

}
