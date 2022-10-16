package apti;

public class Pattern {
		public static void main(String[] args) {
			for(int row = 1; row<=4; row++)
			  { 
				for(int col=1;col<=4-row;col++)
				{
					System.out.print(" ");
				}
				for(int star=1;star<=row;star++) {
					System.out.print("*");
				}
				for(int star=1;star<row;star++) {
					System.out.print("*");
				}
		
			   System.out.println(); 
			  }        
			
			/*for(int row=0;row<=5;row++) {
				for(int col=0;col<=row;col++)
			}*/
		}
}
