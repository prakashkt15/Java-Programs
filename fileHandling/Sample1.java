package fileHandling;

import java.io.File;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		File f1 = new File("E:\\sample1");
		if (f1.mkdir()) {
			System.out.println("folder is created");
		} else {
			System.out.println("folder is not created");
		}
		if (f1.exists()) {
			System.out.println("folder exists");
		} else {
			System.out.println("folder not exists");
		}
		Thread.sleep(1000);
		if (f1.delete()) {
			System.out.println("folder deleted");
		} else {
			System.out.println("folder not deleted");
		}
	}

}
