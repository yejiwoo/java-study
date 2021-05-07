package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class test {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/temp2/java.jpg");
		byte[] readBytes = new byte[100];
		int readByteNo;
		while((readByteNo=is.read(readBytes))!=-1) {
			System.out.println(readBytes);
		}
		
		OutputStream os=new FileOutputStream("C:/temp2/test.txt");
		byte[] data="ABC".getBytes();
		os.write(data);
		
		
		is.close();
		os.close();
	}

}
