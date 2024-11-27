package Package1;
public class Circle
{
	private double radious;
	public Circle(double radious)
	{
		this.radious=radious;
	}
	public double getRadious()
	{
		return radious;
	}
	public double getArea()
	{
		return Math.PI*radious*radious;
	}
	
}