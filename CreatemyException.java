package ExceptHandling;

public class CreatemyException {

	public static void main(String[] args) {
		
		CreatemyException a = new  CreatemyException();
		a.calculate();

	}

	private void calculate() {
			int a= 10;
			int b=0;
			try { if(b==0)
			throw new myException("the given second number should be greater than zero");
			int c=a/b;
			}
			catch (myException e){
			e.printStackTrace();
			}
			
	}

}
class myException extends RuntimeException
{
	 myException(String a)
	{
System.out.println(a);
	}
}
