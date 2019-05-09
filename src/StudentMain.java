
public class StudentMain 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		
		
        s1.initStudents(9,"nikhil",90.09f);
        
        s1.printDetails();
	}

}

class Student implements Cloneable
{
	private int roll_no;
	private String name;
	private float percentage;
	
	public void initStudents(int Rollno , String Name,float Percentage)
	{
		roll_no = Rollno;
		name = Name;
		percentage = Percentage;
	}
	
	public void printDetails()
	{
		System.out.println("roll_no:" + roll_no + " name:" + name + " percentage:" + percentage);
	}
	
	
	
	
}