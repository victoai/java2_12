package groupChatt;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		 
		
		FileWriter fw = new FileWriter("log2.txt");
		
		fw.write("dkgkgkkg");
		fw.flush();
		
		
		

	}

}
