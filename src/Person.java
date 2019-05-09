



class Person
{
	private String Name = "rohini";
	private String LastName;
	private int age;
	private int acnt_no;
	private double balance;
	
	Person()//default constructor
	{
		this.Name = "lal";
		this.age = 30;
		this.acnt_no = 03;
		this.balance = 2000;
		
	}
	
	Person(String name,int age,int acnt_no,double balance)
	{
		Name = this.Name;
		this.LastName = this.Name;
		 age = this.age;
		this.acnt_no = acnt_no;
		this.balance = balance;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAcnt_no() {
		return acnt_no;
	}
	public void setAcnt_no(int acnt_no) {
		this.acnt_no = acnt_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void display()
	{
		setName("nikkk");
		setAge(30);
		setAcnt_no(01);
		setBalance(100000.50);
		
		System.out.println("name:" + getName() + " age:" +  getAge() + " account number:" + getAcnt_no() + " account blnc:" + getBalance() );
		
	}
	
	

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		//System.out.println("name:" + p1.getName() + " age:" +  p1.getAge() + " account number:" + p1.getAcnt_no() + " account blnc:" + p1.getBalance());
		//p1.display();
		//System.out.println();
		
		Person p2 = new Person();
		//System.out.println("name:" + p2.getName() + " age:" +  p2.getAge() + " account number:" + p2.getAcnt_no() + " account blnc:" + p2.getBalance());
		//p2.display();
		//System.out.println();
		
		Person p3 = new Person();
		//System.out.println("name:" + p3.getName() + " age:" +  p3.getAge() + " account number:" + p3.getAcnt_no() + " account blnc:" + p3.getBalance());
		
		Person p4 = new Person("poo",23,04,5000);
		//p4.Name = "rohini";
		System.out.println("name:" + p4.getName() + " last name:"+ p4.LastName + " age:" +  p4.getAge() + " account number:" + p4.getAcnt_no() + " account blnc:" + p4.getBalance());
		
	}

	
}
