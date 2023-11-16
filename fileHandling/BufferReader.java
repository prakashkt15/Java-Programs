package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\CreateFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s1 = br.readLine();
		while (s1!=null) {
			System.out.println(s1);
			s1=br.readLine();
		}

	}

}
