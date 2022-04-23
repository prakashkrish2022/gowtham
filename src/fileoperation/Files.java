package fileoperation;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {

		File f= new File("E:\\prakash");
		
		
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		boolean mkdirs = f.mkdirs();
		System.out.println(mkdirs);
		
		File f1= new File("E:\\prakash\\aa\\a2");
		
		boolean createNewFile = f1.createNewFile();
		System.out.println(createNewFile);
		File f3= new File("E:\\prakash\\aa\\a2");
		File f2= new File("E:\\prakash\\aa\\a2");
		
		boolean directory = f.isDirectory();
		System.out.println(directory);
		
		
		boolean file = f1.isFile();
		System.out.println(file);
		
		boolean canRead = f1.canRead();
		System.out.println(canRead);
		
		boolean canRead2 = f1.canRead();
		System.out.println(canRead2);
		
		boolean canExecute = f1.canExecute();
		System.out.println(canExecute);
		

	}

}
