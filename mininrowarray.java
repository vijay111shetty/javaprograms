
public class mininrowarray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int b[][]= {{1,2,3},{4,5,6},{0,8,-1}};
			System.out.println(b[0][0]);
			System.out.println(b.length);
			int min=b[0][0];
			int mincolumn = 0;
			for (int i=0;i<3;i++)
			{
				for (int j=0;j<3;j++)
				{
					System.out.print(b[i][j]);
					if (min>b[i][j])
							{
								 min=b[i][j];
								 
								 mincolumn = j;
							}
					
				}
				System.out.println();
			}
			
			System.out.println("list number in the array is \t" + min);
			System.out.println("min num present in the column oof \t"  + mincolumn);
			int ma = 0;
			for (int w=0;w<3;w++)
			{
				if (b[w][2]>ma)
				{
					ma=b[w][2];
				}
			}
			System.out.println("max value in the 3rd column is" + ma);
			
	}

}
