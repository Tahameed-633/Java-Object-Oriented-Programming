
public class Overloading_Constractor_Test {

	public static void main(String[] args) {
		Teacher teacher1=new Teacher();
		teacher1.DisplayInformation();
		Teacher teacher2=new Teacher("Kabir","male");
		teacher2.DisplayInformation();
		Teacher teacher3=new Teacher("Mahmuda","female",40);
		teacher3.DisplayInformation();

	}

}
