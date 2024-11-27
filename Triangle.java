package Package1;

public class Triangle extends Shape {
	double length,width;
	Triangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double area()
	{
		System.out.print("Area of triangle: ");
		return 0.5*length*width;
	}

}
