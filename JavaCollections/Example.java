package JavaCollections;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,4,3,2,1,2,3,4,5,3,2,1,1,2,4,4};
		//to print how many times the digit is repeating in the array
		ArrayList<Integer> ab=new ArrayList<Integer>();
		for (int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				
			}
		}System.out.println(ab);

	}

}
