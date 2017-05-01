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

		FileReader namesReader = new FileReader(namesInput);
		BufferedReader bufferedReader = new BufferedReader(namesReader);
		String namesInputs;
		List<String> alphaList = new ArrayList<String>();
		while ((namesInput = bufferedReader.readLine()) != null) 
		{
			alphaList.add(namesInput);
		}
		namesReader.close();

		Collections.sort(alphaList);

		FileWriter alphaWriter = new FileWriter(alphaOutput);
		PrintWriter out = new PrintWriter(alphaWriter);
		for (String alpha : newList) 
		{
			out.println(alpha);
		}
		out.flush();
		out.close();
		alphaWriter.close();

	}
}
