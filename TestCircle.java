package Package2;
import java.util.Random;

import Package1.Circle;
public class TestCircle
{
	private static final Circle[] CircleArray = null;
	public static void main(String[] args)
	{
		Circle[] CircleArray=CreateCircleArray(10);
		SumCircleArray(CircleArray);
		PrintCircleArray(CircleArray);
	}
	public static Circle[] CreateCircleArray(int size)
	{
		Circle[] CircleArray=new Circle[size];
		Random random=new Random();
		for(int i=0;i<CircleArray.length;i++)
		{
			
			double radious=random.nextDouble()*100;
			 CircleArray[i]=new Circle(radious);
		}
		return CircleArray;
	}
	public static double SumCircleArray(Circle[] CircleArray)
	{
		double sum=0;
		for(int i=0;i<CircleArray.length;i++)
		{
			sum=sum+CircleArray[i].getArea();
		}
		return sum;
	}
	public static void PrintCircleArray(Circle[] CircleArray)
	{
		System.out.print("Radious\tArea\n");
		for(int i=0;i<CircleArray.length;i++)
		{
			System.out.printf("%.2f\t%.2f\n",CircleArray[i].getRadious(),CircleArray[i].getArea());
			
			
		}
		System.out.println("-----------------");
		System.out.println("Sum of the areas of the circles: "+SumCircleArray(CircleArray));
	}
}