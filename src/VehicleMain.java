
public class VehicleMain 
{

	public static void main(String[] args)
	{
       Vehicle v1 = new Vehicle("Honda","i-vtec","car-sedan",2014);
       v1.showVechileInfo();
	}

}


class Vehicle
{
	private String Brand_name;
	private String Model_name;
	private String Vehicle_type;
	private int Year;
	
	Vehicle(String brand_name,String model_name,String vehicle_type,int year)
	{
		this.Brand_name = brand_name;
		this.Model_name = model_name;
		this.Vehicle_type = vehicle_type;
		this.Year = year;
	}
	
	public void showVechileInfo()
	{
		System.out.println("brand name:" + Brand_name + " model name:" + Model_name + " vehicle type:" + Vehicle_type + " year"  + Year );
	}
}