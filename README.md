# Group-Project
package groupproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupProject 
{

	public static void main(String[] args) throws Exception 
	{

		String namesInput = "names.txt";
		String alphaOutput = "alpha.txt";

		FileReader fileReader = new FileReader(namesInput);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String namesInputs;
		List<String> newList = new ArrayList<String>();
		while ((namesInput = bufferedReader.readLine()) != null) 
		{
			newList.add(namesInput);
		}
		fileReader.close();

		Collections.sort(newList);

		FileWriter fileWriter = new FileWriter(alphaOutput);
		PrintWriter out = new PrintWriter(fileWriter);
		for (String alpha : newList) 
		{
			out.println(alpha);
		}
		out.flush();
		out.close();
		fileWriter.close();

	}
}
