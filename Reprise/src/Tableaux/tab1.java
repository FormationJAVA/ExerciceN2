package Tableaux;

public class tab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3},{3,4,5},{5,6,7}};
		int [][] b = {{1,1,1},{1,1,1},{1,1,1}};
		int [][] c = new int [3][3];
		int lin = a.length;
		int col = a[0].length;
		
		System.out.println(lin);
		System.out.println(col);
		printTab2D(a);
		printTab2D(b);
		matmul(a,b,c);
		printTab2D(c);

	}
	public static void printTab2D(int [][] tab)
	{
		for (int i =0; i<tab.length;++i)
			{
				for (int j =0; j<tab[0].length;++j)
				{
					System.out.print(tab[i][j]);
					if (j<tab[0].length-1)
					System.out.print(", ");
				}
				System.out.println();
			}
				
	}
	public static void matadd (int [][] a, int [][] b,int [][] c) 
	{
		for (int i =0; i<a.length;++i)
		{
			for (int j =0; j<a[0].length;++j)
			{
				c[i][j] = a[i][j] +b[i][j] ;
			}
	
		}
	}
	public static void matmul (int [][] a, int [][] b,int [][] c) 
	{
		for (int i =0; i<a.length;++i)
		{
			for (int j =0; j<a[0].length;++j)
			{
				for (int k=0;k<b[0].length;++k)
					c[i][k] += (a[i][j] *b[j][k]) ;
			}
	
		}
	}

}
