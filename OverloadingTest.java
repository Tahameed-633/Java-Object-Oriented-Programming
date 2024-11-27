
public class OverloadingTest {

	public static void main(String[] args) {
		Overload obj1=new Overload();
		obj1.add();
		obj1.add(5,6);
		obj1.add(9.6,6.9);
		obj1.add(4,9,6);
		Overload obj2=new Overload();
		obj2.add();
		obj2.add(4,6);
		obj2.add(10.7,7.9);
		obj2.add(7,9,8);
		Overload obj3=new Overload();
		obj3.add();
		obj3.add(15,6);
		obj3.add(12.6,6.9);
		obj3.add(4,9,6);
	}

}
