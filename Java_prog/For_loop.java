package Java_prog;
/*

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<5;i++)
		{
			for (int j=1;j<=5-i;j++)
			{
				System.out.print( k); 
				System.out.print("\t");
				k++;
			}
			System.out.println( "");
		}

	}

}
*/
/* out put is
1	2	3	4	5
6	7	8	9	
10	11	12	
13	14	
15
*/
/*
public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<5;i++)
		{
			for (int j=1;j<=0+i;j++)
			{
				System.out.print( k); 
				System.out.print("\t");
				k++;
			}
			System.out.println( "");
		}

	}

}
*/
/* out put is
1	
2	3	
4	5	6	
7	8	9	10	
*/
public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<5;i++)
		{
			for (int j=1;j<=0+i;j++)
			{
				System.out.print( 3*k); 
				System.out.print("\t");
				k++;
			}
			System.out.println( "");
			
		}

	}
	/* out put is
	3	
	6	9	
	12	15	18	
	21	24	27	30	
	
	*/


}