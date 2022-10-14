package apti;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();	
		
		int add=0;
		for(int i=1;i<num;i++)
		{
		if(num%i==0)	
		add = add+i;
		}
System.out.println(add);
if(num==add)
	System.out.println("the given number is perfect");
else
	System.out.println("not perfect");
	}

}
