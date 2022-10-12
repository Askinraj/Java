package apti;

public class Palindrome {
	public static void main(String[] args) {
		int a = 45678;
		int save = 0;
		int rem;
		while(a>0)
		{
			 rem= a%10;
			save = (save*10)+rem;
			a=a/10;
		}
		System.out.println(save);
		
	}
		
}
