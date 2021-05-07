package sec03;

import java.io.OutputStream;

public class SystemOutExample{

	public static void main(String[] args)  throws Exception{
		OutputStream os=System.out;
		
		for(byte b=48; b<58; b++) {
			os.write(b);
		}
		
		os.flush();
	}

}
