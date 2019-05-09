
public class C 
{

	public static void main(String[] args) 
	{
		B b1 = new B();
	
		A a1 = b1;
		a1.read();
		
		I i1 = b1;
		i1.watch();
		
		b1.read();
		b1.watch();
		b1.exec();
		System.out.println(b1);

	}

}
