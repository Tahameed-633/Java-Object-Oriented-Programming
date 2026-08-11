package problem01;

public class Calculator {
	private double num1;
	private double num2;
	public Calculator(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void setNum1(double num1)
	{
		this.num1=num1;
	}
	public double getNum1()
	{
		return num1;
	}
	public void setNum2()
	{
		this.num2=num2;
	}
	public double getNum2()
	{
		return num2;
	}
	public void add()
	{
		try
		{
			double result=num1+num2;
			
			if(result<0)
			{
				throw new ArithmeticException("Addition result can't be a negative number");
			}
			System.out.println("Addition Result="+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void sub()
	{
		try
		{
			double result=num1-num2;
			
			if(result<0)
			{
				throw new ArithmeticException("Subtraction result can't be a negative number");
			}
			System.out.println("Subtraction Result="+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public void mul()
	{
		try
		{
			double result=num1*num2;
			
			if(num1==0 && num2==0)
			{
				throw new ArithmeticException("Both multiplicant and multiplier can't be zero");
			}
			System.out.println("Multiplication Result="+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void div()
	{
		try
		{
			double result=num1/num2;
			
			if(num1==0 && num2==0)
			{
				throw new ArithmeticException("Both dividant and divisor can't be zero");
			}
			System.out.println("Divison Result="+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}


