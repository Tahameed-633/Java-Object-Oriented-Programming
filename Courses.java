package Package1;
public class Courses
{
	private String course_name;
	private String course_instructor;
	private String course_code;
	private String course_credit;
	
	public Courses(String course_name,String course_instructor, String course_code,String course_credit)
	{
		this.course_name=course_name;
		this.course_instructor=course_instructor;
		this.course_code=course_code;
		this.course_credit=course_credit;
	}
	public String getCourseName()
	{
		return course_name;
	}
	public String getCourseCode()
	{
		return course_code;
	}
	public String getCourseCredit()
	{
		return course_credit;
	}
	public String getCourseInstructor()
	{
		return course_instructor;
	}
	public String toString()
	{
		return "\nCourse Name: "+course_name+"\nCourse Code: "+course_code+"\nCourse Credit: "+course_credit+"\nCourse Instructor: "+course_instructor;
	}
	
}