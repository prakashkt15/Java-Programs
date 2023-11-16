package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {

	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\CreateFile.txt");
		FileWriter fw = new FileWriter(f1);
		fw.write("Hello");
		fw.flush();
		System.out.println("data is written");
	
	}

}
