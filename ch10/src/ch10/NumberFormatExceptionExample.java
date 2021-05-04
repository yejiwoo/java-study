package ch10;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {

		String data1="100";
		String data2="a100";
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2); //NumberFormatException발생: a100 문자열은 숫자로 변환 불가
		
		int result=value1+value2;
		System.out.println(data1+"+"+data2+"="+result);
	}

}
