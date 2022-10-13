package apti;
public class lcm  
{  
	public static void main(String[] args) {
		
  int a=50,b=60;
  int max = (a > b) ? a:b;
  while(true)
  {
  if(max % a == 0 && max % b == 0)
  {
	  System.out.println(max);
	  break;
  }
  max++;
}
}
}