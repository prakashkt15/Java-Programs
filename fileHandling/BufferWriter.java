package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\CreateFile.txt");
		FileWriter fw = new FileWriter(f1,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello Selenium");
		bw.newLine();
		bw.write("Hello Selenium");
		bw.newLine();
		bw.write("Hello Selenium");
		bw.newLine();
		bw.flush();
		
		System.out.println("data is written");
	}
}
