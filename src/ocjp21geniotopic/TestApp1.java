package ocjp21geniotopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		try (
				FileOutputStream fout = new FileOutputStream("studentrcd.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s1);	
			System.out.println("Success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
