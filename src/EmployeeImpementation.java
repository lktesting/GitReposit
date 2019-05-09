
public class EmployeeImpementation 
{

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("nikhil",50000.50f);
		emp1.printDetails();
		
		Employee emp2 = new Employee("pradnya",60000.80f);
		emp2.printDetails();
		
		Employee emp3 = new Employee("ankita",80000.50f);
		emp3.printDetails();
		
		Employee emp4 = new Employee("gitu",90000.50f);
		emp4.printDetails();
		
	}

}

class Employee
{
	static int empid = 0;
	String Name;
	float Salary;
	
	Employee(String name,float salary)
	{
		empid++;
		Name = name;
		Salary = salary;
		
	}
	
	public void printDetails()
	{
		System.out.println("emp id:" + empid + " " +  "name:" + Name + "salary:" + Salary);
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Salary=" + Salary + "]";
	}
	
}