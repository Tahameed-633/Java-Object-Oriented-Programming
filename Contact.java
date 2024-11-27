package Package1;
public class Contact
{
	private String phone_number;
	private String email;
	public Contact(String phone_number,String email)
	{
		this.phone_number=phone_number;
		this.email=email;
	}
	public String getPhoneNumber()
	{
		return phone_number;
	}
	public String getEmail()
	{
		return email;
	}
	public String toString()
	{
		return "\nPhone Number: "+phone_number+"\nEmail: "+email;
	}
}