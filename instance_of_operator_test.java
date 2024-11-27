public class instance_of_operator_test
{
	public static void main(String[] args)
	{
		Person p1=new Person(53,"Harun");
		Teacher t1=new Teacher(53,"Harun","CSE");
		Student s1=new Student(22,"Tahameed","CSE","3.79");
		System.out.println(t1 instanceof Person);
		System.out.println(s1 instanceof Teacher);
		System.out.println(s1 instanceof Person);
		System.out.println(p1 instanceof Teacher);
	}
}