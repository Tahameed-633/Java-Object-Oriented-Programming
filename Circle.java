package Package1;

public class Circle extends Shape {
	public double radious;
	Circle(double radious)
	{
		this.radious=radious;
	}
	public double area()
	{
		System.out.print("Area of the circle: ");
		return Math.PI*radious*radious;
	}

}
