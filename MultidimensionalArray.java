
public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= {{1,2,3},{4,5,6},{0,8,-1}};
		System.out.println(b[0][0]);
		System.out.println(b.length);
		int c=0;
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(b[i][j]);
				if (b[0][0]>b[i][j])
						{
							 b[0][0]=b[i][j];
						}
				
			}
			System.out.println();
		}
		System.out.println("list number in the array is \t" + b[0][0]);
	}

}
