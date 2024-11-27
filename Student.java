public class Student extends Teacher
{
	private String cgpa;
	public Student(int age,String name,String subject,String cgpa)
	{
		super(age,name,subject);
		this.cgpa=cgpa;
	}
	public void display3()
	{
		display2();
		System.out.println("CGPA: "+cgpa);
	}
}