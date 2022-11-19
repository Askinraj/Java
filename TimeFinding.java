package array;

public class TimeFinding {

	public static void main(String[] args) {
		int []arr = {5,2,3,5};
		for(int i=2;i>=0;i--)
		{
			int j;
			for( j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
				int a=arr[0];
				arr[0]=arr[j];
				arr[j]=a;
				}
			
			}
		
			if(arr[0]==i)
				break;
			
		}
		if(arr[0]==2)
		{
			
			for(int i=3;i>=0;i--)
			{
				int j;
				for( j=1;j<arr.length;j++)
				{
					if(arr[j]==i)
					{
					int a=arr[1];
					arr[1]=arr[j];
					arr[j]=a;
					}
					
				}
			
				if(arr[1]==i)
					break;
			}
		}
		else
		{
			
			for(int i=9;i>=0;i--)
			{
				int j;
				for( j=1;j<arr.length;j++)
				{
					if(arr[j]==i)
					{
					int a=arr[1];
					arr[1]=arr[j];
					arr[j]=a;
					}
					
				}
			
				if(arr[1]==i)
					break;
			}
		}
		for(int i=5;i>=0;i--)
		{
			int j;
			for( j=2;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
				int a=arr[2];
				arr[2]=arr[j];
				arr[j]=a;
				}
				
			}
		
			if(arr[2]==i)
				break;
		}	
		int value = 0;
		for(int i=0;i<arr.length;i++)
		{
			value = value*10 + arr[i];			
		}
		if(value<=2359)
		{
			System.out.println("The Given Time is "+arr[0]+arr[1]+":"+arr[2]+arr[3]);
		}
		else
			System.out.println("Enter valid number");

	}

}
