package Package1;


public class Address {
	private String house_number;
	private String road_number;
	private String city;
public Address(String house_number,String road_number,String city)
{
	this.house_number=house_number;
	this.road_number=road_number;
	this.city=city;
}
public String getHouseNumber()
{
	return house_number;
}
public String getRoadNumber()
{
	return road_number;
}
public String getCity()
{
	return city;
}
public String toString()
{
	return "\nHouse Number: "+house_number+"\nRoad Number: "+road_number+"\nCity: "+city;
}
}
