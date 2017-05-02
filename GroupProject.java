import java.io.*;
import java.util.*;

class GroupProject 
{
 public static void main(String args[])
  {
  try
  {
  FileInputStream fstream = new FileInputStream("names.txt");
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  
  List<String> list = new ArrayList<String>();
  
  int count = 0;
  
  // Put text file into an array list
  while ((strLine = br.readLine()) != null)   
  {
    list.add(strLine);
    count += 1;
  }

  // sort into alphabetical order
  java.util.Collections.sort(list);
  
  // print for checking
  // for (String s : list) 
  // {
  //    System.out.println(s);
  // }
 
  in.close();
  
  // array for int values for each letter
  char[] alpha = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L',
    'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  int[] alphaValue = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
    20,21,22,23,24,25,26};
  
  // initialize variables for summation
  int size = list.size();
  int[] sum = new int[size];
  int nameSize = 0;
  int nameSum = 0;
  int loopCount = 0;
  String name = "";
  int nameIndex = 0;
  int alphaSize = alpha.length;
  int x = 0;
  boolean match = false;
  
  //loop for each name ------------------------------------------------------
   while (loopCount <= size)   
  {
    name = list.get(loopCount);
    nameSize = name.length();
    nameIndex = 0;
    
    //loop for each letter in each name
    while(nameIndex <= nameSize)
    {
      x = 0;
      char a_char = name.charAt(nameIndex);
      
      while(match == false)
      {
      if(a_char == alpha[x])
      {
        nameSum += alphaValue[x];
        nameIndex += 1;
        match = true;
      }
      
      x += 1;
      }
    }
    sum[loopCount] = nameSum * (loopCount + 1);
    loopCount += 1;
  }
   //end of loop for each name -----------------------------------------------

    }
  
  catch (Exception e)
  {
  System.err.println("Error: " + e.getMessage());
  }
  
  }
}