package sec07;

import java.io.IOException;

/*
 * 키보드로부터 읽은 바이트 배열을 문자열로 변환
 */
public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {

		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");

		//키보드에서 입력한 내용을 매개값으로 주어진 바이트 배열에 저장하고
		//읽은 바이트 수를 리턴
		int readByteNo=System.in.read(bytes);	
		
		//배열을 문자열로 전환
		String str=new String(bytes,0,readByteNo-2); //마지막 두글자는 Enter(\r\n) 
		System.out.println(str); 
	}

}
