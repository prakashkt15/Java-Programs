package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) throws IOException {
		File f1 = new File("E://CreateFile.txt");
				if (f1.createNewFile()) {
					System.out.println("file is created");
				} else {
					System.out.println("file is not	 created");
				}

	}

}
