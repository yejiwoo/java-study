package sec04;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws URISyntaxException, IOException {

		File dir=new File("C:/temp2/Dir");
		File f1=new File("C:/temp2/file1.txt");
		File f2=new File("C:/temp2/file2.txt");
		File f3=new File(new URI("file:///C:/temp2/file3.txt"));
		
		if(!dir.exists()) dir.mkdirs();
		if(!f1.exists()) f1.createNewFile();
		if(!f2.exists()) f2.createNewFile();
		if(!f3.exists()) f3.createNewFile();
		
		File temp=new File("C:/temp2");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  a  HH:mm");
		File[] contents=temp.listFiles();
		
		System.out.println("날짜\t\t시간\t형태\t\t크기\t이름");
		System.out.println("---------------------------------------------------------");
		for(File file: contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t"+file.getName());
			}else {
				System.out.println("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
		
	}

}
