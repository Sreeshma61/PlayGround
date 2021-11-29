import java.io.*;
import java.lang.*;
import java.io.FileReader;
import java.io.FileWriter;
public class replace
{
 String operation(String str,String word)
{
 
  String[] word_list=str.split("\\s+");
  String result="";
   String hash="";
  for(int i=0;i<word.length();i++)
  {
   hash+="#";
  }
 int index=0;
 for(String i:word_list)
  { if(i.compareTo(word)==0) 
   word_list[index]=hash;
   index++;
  }
for(String i:word_list)
{
  result+=i;
}
  return result;
}

public static void main(String[] args)
{
 try
 {
 System.out.println("Enter the file path");
 File path=new File(System.in);
 reader=new BufferedReader(new FileReader(path));
 System.out.println("Enter the word");
 word=new char(System.in);
  
  FileReader fr=new FileReader(reader);
  String str="";
  int i;
 while((i=fr.read())!=-1)
{ 
 str+=(char)i;
}
replace obj=new replace();
String resul=obj.operation(str,word);
fr.write(resul);
System.out.println(resul);
fr.close();
}
catch(IOException e){
System.out.println("IOException");
}
}
}