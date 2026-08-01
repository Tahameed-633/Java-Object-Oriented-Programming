package pac1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked_Exceotion {

	public static void main(String[] args) throws IOException {
		readFile("src/pac1/test.txt");

	}
	public static void readFile(String file_name) throws IOException
	{
		try
		{
			FileReader reader=new FileReader(file_name);
			System.out.println("File Opened Successfully!");
			reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found!");
			System.out.println(e.getMessage());
		}
	}

}
