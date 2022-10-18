package array;

import java.util.Scanner;

public class aray {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the Size of array");
		   int x=sc.nextInt();
			int a[] = new int [x];
			System.out.println("array elements");
			for(int i=0;i<a.length;i++)
				a[i]=sc.nextInt();
	/*		System.out.println("Enter the number you want to find index");
		int g=sc.nextInt();
			for(int i=0;i<a.length;i++) {
				if(a[i]==g) 
					 System.out.println("the array is"+i);
			} */
			  int count=0;
		  for(int i =0;i<x;i++)
		  {
			
		  if(a[i]==a[a.length-1-i])
		  {
			count++;
			
		  }
		 
		  }
		  System.out.println(count);		
	}

}
