import java.io.*;
import java.util.*;
public class FileHandling
{
	public void writeToFile(String fileName, String content)
	{
		try(FileWriter fw = new FileWriter(fileName); //getting the location ready
			BufferedWriter bw = new BufferedWriter(fw)) //getting the writer object ready
			{
				//code to write stuff
				bw.write(content);
				System.out.println("Content written to "+fileName);
			}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void readFromFile(String fileName)
	{
		try(FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr))
			{
				//code to read stuff
				String line;
				while((line = br.readLine()) != null)
				{
					System.out.println(line);
				}
			}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)
	{
		String content;
		String fileName = "example.txt";
		FileHandling fh = new FileHandling();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter content to write to file: ");
		content = sc.nextLine();
		fh.writeToFile(fileName, content);
		fh.readFromFile(fileName);
		
	}
}
