package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File f = new File("/home/itachi/Documents/kili/askin.doc");
	//	System.out.println(f.createNewFile());
		//System.out.println(f.mkdir());
//System.out.println(f.exists());
//System.out.println(f.delete());
	//System.out.println(f.getName());
		
		/*
		String a[] = f.list();
	for(String i : a)
	{
		System.out.println(i);
	}
	*/
		
		// <-----------Writer ----->
		/*
f.createNewFile();
FileWriter fl = new FileWriter(f);
BufferedWriter br = new BufferedWriter(fl);
br.write("i am king ");
br.newLine();
br.write("of my own Kingdomn");
fl.write("HI all I am trying to write in the doc file about the wrier and here my mobie number 9042421259 and mail id : askinraj@gmialcom *&%^@&^%!@");


br.flush();
br.close();
*/
// <----------------writer--------->

		// <------- Reader------->
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
        String [] arr = str.split(" ");
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i].charAt(0) >= 'A' && arr[i].charAt(0)<='Z' )
        	{
        		count++;
        	
        	}
        	
        }
        System.out.println("The Total Capital Words="+count);
        
		while(str!=null)
		{
		System.out.println(str);
		str=br.readLine();
		} 
	
	/*
	int value= fr.read();
	while(value!=-1)
	{
	System.out.print((char)value);
	value = fr.read();
	
	}
		*/
		// <---------------reader------->
	
	
	}
	

}
