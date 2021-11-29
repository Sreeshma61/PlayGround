impot java.io.*;
impot java.io.FileReader;
impot java.io.FilWriter;
public class replace{
Static String operation(String path,String word)
{
 
  String[] word_list=str.split("\\s+");
  String result=' ';
   String hash=' ';
  for(int i=0;i<word.length();i++)
  {
   hash+="#";
  }
  int index=0;
 for(Sting i:word_list)
  {
 if(i.compareTo(word)==0)         
   word_list[index]=hash;
   index++'
  }
for(String i:word_list)
{
  result+=i+'';
}
  return result;
}
}
Public static void main(Sting[] args)
{
 System.out.println("Enter the file path");
 File path=new File(System.in);
 System.out.println("Enter the word");
 Scanner word=new Scanner(System.in);
  path.open();
  FileReader fr=new FileReader(path);
 String str='';
while((int i=fr.read())!=-1)
{ 
 str+=(cha)i;}
replace r=new replace();
 r.operation(str,word);
fr.write(result);
System.out.println(result);
fr.close();
}
}