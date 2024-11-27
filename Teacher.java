public class Teacher extends Person
{
private String subject;
	public Teacher(int age, String name,String subject) {
		super(age, name);
		this.subject=subject;
		
	}
	public void display2()
	{
		Display();
		System.out.println("Subject: "+subject);
	}
	
}
