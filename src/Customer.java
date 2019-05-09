
public class Customer 
{

	static int count;
	
	Customer()
	{
		count++;
	}
	static//static block is executed first evn b4 main method
	
	{
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("no. of customers before creating objects" + count);
		Customer cust1 = new Customer();
		Customer cust2 = new Customer();
		Customer cust3 = new Customer();
		
		System.out.println("no. of customers after creating objects:" + count);
	}

}
