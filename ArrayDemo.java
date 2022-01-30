
public class ArrayDemo {

	public static void main0(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5]; //Declaring the array and allocating the memory to the list of array with 5 values
		a[0]=2;
		a[1]=11;
		a[2]=33;
		a[3]=23;
		a[4]=12;
		//a[5]=18;
		//OR
		int b[] = {1,2,3,4,5,8}; //simple way of writing array
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}
	//multi dmensional array a[row][column]
	public static void main(String[] args) {
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(b[0][0]);
		System.out.println(b.length);
		for (int i=1;i<3;i++)
		{
			for (int j=1;j<3;j++)
			{
				System.out.print(b[i][j]);
			}
		}
		
	}

}
