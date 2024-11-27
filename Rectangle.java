package Package1;

public class Rectangle extends Shape {
	public double length;
	public double width;
Rectangle(double length,double width)
{
	this.length=length;
	this.width=width;
}
public double area()
{
	System.out.print("Area of rectangle: ");
	return length*width;
}
}
