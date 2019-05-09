
public class B extends A implements I
{
 private String name;
 private int value;
 
 public B() 
 {
	
    name = "nik";
	value = 1;
 }

public B(String name, int value) 
{
	
	this.name = name;
	this.value = value;
}

@Override
public String toString()
{
	return "B [name=" + name + ", value=" + value + "]";
}

public void watch()
{
	System.out.println("you are watching interface");
}
public void read()
{
System.out.println("you are reading abstract class");
	  
}
	
public void exec()
{
	System.out.println("we are executing class");
}
}
