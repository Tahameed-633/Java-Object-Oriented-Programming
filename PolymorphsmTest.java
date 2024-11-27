package Package1;

public class PolymorphsmTest {

	public static void main(String[] args) {
		Shape[] s=new Shape[4];
		s[0]= new Shape();
		s[1]=new Rectangle(20.75,4.5);
		s[2]=new Triangle(5,8);
		s[3]=new Circle(5);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].area());
		}
	}

}
