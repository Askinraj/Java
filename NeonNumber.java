package apti;

public class NeonNumber {

	public static void main(String[] args) {
		NeonNumber obj = new NeonNumber();
		obj.FindNeo();

	}

	private void FindNeo() {
		int num = 9;
		int square;
		int sum=0;
square = num*num;
for(int i = 0;square>0;i++)
{
int tem=square%10;
sum+=tem;
square = square/10;
}
		System.out.println(sum);
		if(num==sum)
		System.out.println("the number is Neon");
	}

}
