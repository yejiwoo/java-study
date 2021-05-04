package ch04;

import java.io.IOException;
import java.util.Scanner;

public class ch04 {

	static void IfNestedExample() {
		// 81< = score < 101
		int score=(int)(Math.random()*20)+81;
		System.out.println("점수: "+score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) grade="A+";
			else grade="A";
		}else {
			if(score>=85) grade="B+";
			else grade="B";
		}
		
		System.out.println("학점: "+ grade);
	}
	
	static void ForSumFrom1To100Example() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	static void WhileKeyControllExample() throws IOException {
		
		int keyCode=0;
		boolean flag=true;
		int speed=0;
		
		while(flag) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("------------");
				System.out.println("1.증속|2.감속|3.중지");
				System.out.println("------------");
				System.out.print("선택:");
			}
			keyCode = System.in.read();
			
			switch(keyCode) {
			case 49:
				speed++;
				System.out.println("현재속도="+speed);
				break;
			case 50:
				speed--;
				System.out.println("현재속도="+speed);
				break;
			case 51:
				flag=false;
				System.out.println("프로그램 종료");
				break;

					
			}
		} // end of while
	}
	
	static void DoWhileExample() {
		System.out.println("메시지를 입력하세요.\n프로그램 종료는 q를 누르세요.");
		
		Scanner scanner=new Scanner(System.in);	// Scanner 객체 생성
		String inputString;
		
		do {
			System.out.print(">");
			inputString=scanner.nextLine();		// 문자열 얻음
			// inputString=scanner.next();		// 단어 하나 받음. 타입별 받는 메서드 다 따로 있다.
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		scanner.close();
	}
	
	static void BreakOutterExample() {
		Outter:for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g')
					break Outter;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		IfNestedExample();
//		ForSumFrom1To100Example();
//		WhileKeyControllExample();
//		DoWhileExample();
//		BreakOutterExample();
		
		
		
		  String nullStr = null ;
	      System.out.println("nullStr메모리어드레스: " + System.identityHashCode(nullStr));
	      
	      
	      //메소드 내에 선언되는 변수의 타입이 기본 타입일 때 null로 초기화 못시킵니다.
	      //int myInt = null ;   //Type mismatch: cannot convert from null to int
	      //boolean mybool = null ; // Type mismatch: cannot convert from null to boolean
	      
	      //double myDouble = null ;  //Type mismatch: cannot convert from null to double
	      

	      Integer myInt2 = null ;
	      String strVar11 = "신민철";
	      String strVar22 = "신민철";
	      
	      System.out.println("strVar1메모리어드레스: " + System.identityHashCode(strVar11));
	      System.out.println("strVar1메모리어드레스: " + System.identityHashCode(strVar22));
	      
	      if (strVar11 == strVar22) {
	         System.out.println("strVar1과 strVar2는 참조가 같음");
	         
	      } else {
	         System.out.println("strVar1과 strVar2는 참조가 다름");

	      }
	      
	      if (strVar11.equals(strVar22)) {
	         System.out.println("strVar1과 strVar2는 문자열이 같음");
	         
	      } else {
	         System.out.println("strVar1과 strVar2는 문자열이 다름");

	      }
	      
	      String strVar3 = new String("신민철");
	      String strVar4 = new String("신민철");
	      
	      System.out.println("strVar1메모리어드레스: " + System.identityHashCode(strVar3));
	      System.out.println("strVar1메모리어드레스: " + System.identityHashCode(strVar4));
	      
	      if (strVar3 == strVar4) {
	         System.out.println("strVar3과 strVar4는 참조가 같음");
	         
	      } else {
	         System.out.println("strVar3과 strVar4는 참조가 다름");

	      }
	      
	      if (strVar3.equals(strVar4)) {
	         System.out.println("strVar3과 strVar4는 문자열이 같음");
	         
	      } else {
	         System.out.println("strVar3과 strVar4는 문자열이 다름");

	      }
	      
	}

}
