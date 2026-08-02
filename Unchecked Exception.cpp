package pac2;

public class Unchecked_Exception {

	public static void main(String[] args) {
		try
		{
			int ar[]= {8,9,7,6};
			System.out.println(ar[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
