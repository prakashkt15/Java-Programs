package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\CreateFile.txt");
		FileReader fr = new FileReader(f1);
		char[]arr=new char[(int) f1.length()];
		fr.read(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
