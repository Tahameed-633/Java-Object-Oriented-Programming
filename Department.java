package Package1;
public class Department
{
	private String department_name;
	private String department_building;
	public Department(String department_name,String department_building)
	{
		this.department_name=department_name;
		this.department_building=department_building;
	}
	public String getDepartmentName()
	{
		return department_name;
	}
	public String getDepartmentBuilding()
	{
		return department_building;
	}
	public String toString()
	{
		return "\nDepartment Name: "+department_name+"\nDepartment Building: "+department_building;
	}
}