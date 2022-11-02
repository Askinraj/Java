package sorting;

public class Spiral {

	public static void main(String[] args) {
		int minRow=0, maxRow=3; 
		  int minCol=0, maxCol = 3; 
		  int[][] ar = new int[4][4]; 
		  int no = 1; 
		  while(no<=16)
		  {
		  for(int col=minCol; col<=maxCol; col++)
		  {
		  ar[minRow][col] = no;
		  no++;
		  }
		  minRow++; 

		  for(int row=minRow; row<=maxRow; row++)
		  {
		  ar[row][maxCol] = no;
		  no++;
		  } 
		  maxCol--; 

		  for(int col=maxCol; col>=minCol; col--)
		  {
			  ar[maxRow][col] = no; 
			  no++; 
			  }
		  maxRow--;
		   
		  for(int row=maxRow; row>=minRow; row--)
		  {
			  ar[row][minCol] = no;
			  no++;
			  }
		  minCol++; 

		  }
		  
		  for(int row=0; row<4; row++)
		  {
		   for(int col=0; col<4; col++)
		   {
		    System.out.print(ar[row][col]+ "\t"); 
		   }
		      System.out.println("\n\n");

		  }
	}

}
