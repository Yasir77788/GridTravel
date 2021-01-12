// program to find the number of paths in a grid
// this programming shows both recursive and iterative approach
public class GridTravel
{
	public static void main(String[] args)
	{
		int m = 3; // number of rows in grid
		int n = 4; // number of columns in grid
		System.out.println(findNumberOfPaths(m, n)); // using recursion
		System.out.println(finNumberOfPaths(m, n));  // using DP (iterative)
		
		
		
	}
	
	/* using recursive method to calculate number of paths in
	* m X n grid. The run time is (2^n)
	* @param m is number of rows
	* @param n is number of columns
	* @return an integer
        */
	public static int findNumberOfPaths (int m, int n)
	{
		if(m == 1 && n == 1)
			return 1;
		if(m == 0 || n == 0)
			return 0;
		else
			return findNumberOfPaths(m-1, n) + findNumberOfPaths(m, n-1);
		
	}
	// using iterative approach to find number of path
	// in a m X n grid
	// time complexity if O(mn)
	 static int finNumberOfPaths(int m, int n) 
	 {
		 
		 int paths [][] = new int[m][n];
		 
		 for(int i = 0; i < m; ++i)
			 paths[i][0] = 1;
		 
		 for(int j = 0; j < n; ++j)
			 paths[0][j] = 1;
		 
		 
		 for(int i = 1; i < m; ++i)
		 {
			 for(int j = 1; j < n; ++j)
			 {
				 paths[i][j] = paths[i - 1][j] + paths[i][j -1];
			 }
		 }
		 
		 return paths[m-1][n-1];
		 
	 }
}
