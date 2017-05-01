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
		
		String alphaInput = "alpha.txt";
		String numbersOutput = "number.txt";
		
		FileReader alphaReader = new FileReader(alphaInput);
		BufferedReader bufferedReaderTwo = new BufferedReader(alphaReader);
		String alphaInputs;
		List<String> numbersList = new ArrayList<String>();
		while ((alphaInputs = bufferedReaderTwo.readLine()) != null)
		{
			// This is where I start to assign integers to variables
			int A = 1;
			int B = 2;
			int C = 3;
			int D = 4;
			int E = 5;
			int G = 7;
			int H = 8;
			int I = 9;
			int J = 10;
			int K = 11;
			int L = 12;
			int M = 13;
			int N = 14;
			int O = 15;
			int P = 16;
			int Q = 17;
			int R = 18;
			int S = 19;
			int T = 20;
			int U = 21;
			int V = 22;
			int W = 23;
			int X = 24;
			int Y = 25;
			int Z = 26;

			numbersList.add(alphaInputs);
		}
		alphaReader.close();
		

		FileWriter numbersWriter = new FileWriter(numbersOutput);
		PrintWriter cout = new PrintWriter(numbersWriter);
		for (String numbers : numbersList) 
		{
			cout.println(numbers);
		}
		cout.flush();
		cout.close();
		numbersWriter.close();
			
	}


	}
}
