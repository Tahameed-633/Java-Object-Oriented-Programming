package pac1;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Checked_Exception_2 {

	public static void main(String[] args) {
		readFile("src/pac1/test.txt");

	}
	public static void readFile(String file_name)
	{
		try
		{
			FileReader reader=new FileReader(file_name);
			System.out.println("File Opened Successfully!");
			try
			{
				reader.close();
				System.out.println("Reader Closed Successfully!");
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found!");
		}
	}

}
