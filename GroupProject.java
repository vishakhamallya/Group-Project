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
  
  while ((strLine = br.readLine()) != null)   
  {
    list.add(strLine);
    count += 1;
  }

  java.util.Collections.sort(list);
  
    for (String s : list) {
        System.out.println(s);
    }
 
  in.close();
  
    }
  
  catch (Exception e)
  {
  System.err.println("Error: " + e.getMessage());
  }
  
  }
}