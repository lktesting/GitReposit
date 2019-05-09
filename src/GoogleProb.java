
public class GoogleProb 
{
	

	public static void main(String[] args) 
	{
		boolean isPrime = true;
		int num =4;
		if(num > 1)
		{
		for(int i =2;i <= num/2;i++)//i<=3/2=1
		{
			int temp = num % 2;
			if(temp == 0)
			{
				isPrime = false;
				break;
			}
			
		}
       System.out.println(isPrime);
		}
		else
		{
			isPrime = false;
			 System.out.println(isPrime);
		}
	}

}
