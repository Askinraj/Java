package Strings;

public class StrPractice1 {

	public static void main(String[] args) {
StrPractice1 obj = new StrPractice1();
//obj.StartsFinding();
//obj.Uppercase();
//obj.ExistorNot();
String z="i love my india";
String gg[]=z.split(" ");
for(int i=0;i<gg.length;i++)
{
	System.out.println(gg[i]);
}


}
private void ExistorNot() {
		String c="kannadasan";
		boolean boo=false ;
		char bi[]=new char[c.length()];
		String input = "san";
		char be[] = new char[input.length()];
		for(int i=0;i<c.length();i++)

		{
			bi[i]=c.charAt(i);
		}
		for(int i=0;i<input.length();i++)
		{
			be[i]=input.charAt(i);
		}
		for(int i=0;i<c.length();i++)
		{
			if(bi[i]==be[0])
			{

				for(int j=1;j<input.length();j++)
				{
					int k = i+1;
					if(bi[k]==be[j])
					{
						
						boo=true;
					}
					k++;
				}
			break;
			}
			
		}
		System.out.println(boo);
	}
private void Uppercase() {
	String b="jerome";
	char ch[]=new char[b.length()];
	for(int i=0;i<b.length();i++)
	{
		ch[i]=b.charAt(i);
	}
	for(int i=0;i<b.length();i++)
	{
		if(i%2==0)
		System.out.print((char)(ch[i]-32));
		else
			System.out.print(ch[i]);
	}
	
		
	}
void StartsFinding()
	{
		String a="askin";
		String Starts="bs";
		boolean e=false;
		if(a.charAt(0)==Starts.charAt(0)&&a.charAt(1)==Starts.charAt(1))
		{
			 e=true;
		}
		System.out.println(e);
	}
}