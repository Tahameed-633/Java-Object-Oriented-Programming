package pac3;

public class Throw_Exception_01 {

	public static void main(String[] args) {
		try
		{
			fun();
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Caught in main()");
		}
	}
	public static void fun()
	{
		try
		{
			int ar[]=new int[4];
			System.out.println(ar[2]);
			throw new NullPointerException("Object Referance Is Null!");
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Caught in fun()");
			throw e;
		}
	}

}
