package ch02;

public class ch02 {

	static void PromotionExample() {
		byte byteVal =10;
		int intVal=byteVal;	//int <- byte
		System.out.println(intVal); 	//10
		
		char charVal='a';
		intVal=charVal;	// int <- char
		System.out.println(intVal);		//97
		
		intVal=500;
		long longVal=intVal;	// long <- int
		System.out.println(longVal);	// 500
		
		double doubleVal=intVal;	// double <- int
		System.out.println(doubleVal);	// 500.0
	}
	
	static void CheckValueBeforeCasting() {
		int i=128;
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		}else {
			byte b=(byte)i;
			System.out.println(b);	// i 값 그대로
		}
	}
	/**
	 * 복습!!!
	 */
	static void GarbageValueExample() {
		byte var1=125;
		int var2 = 125;
		for(int i=0;i<5;i++) {
			var1++; var2++;
			System.out.println("var1: "+var1+", var2: "+var2);
		}
	}
	
	/**
	 * 복습!!!
	 */
	static void floatDoublueExample() {
		
		//실수값 저장
		double var1=3.14;
		// float var2=3.14;  // 컴파일 에러(Type mismatch)
		float var3=3.14F;
		
		//정밀도 테스트
		double var4=0.1234567890123456789;
		float var5=0.1234567890123456789F;
		
		System.out.println("var1: "+var1);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);  // var4, var5 왜 차이나???
		System.out.println("var5: "+var5);
		
		//e사용하기
		int var6=300000;
		double var7=3e6;
		float var8=3e6F;
		double var9=2e-3;
		
		System.out.println("var6: "+var6);
		System.out.println("var7: "+var7);
		System.out.println("var8: "+var8);
		System.out.println("var9: "+var9);
	}
	
	static void booleanExample() {
		boolean stop=true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
	}
	
	static void castingExample() {
		int intValue = 44032;
		char charValue=(char)intValue;
		System.out.println(charValue);  // 가
		
		long longValue=500;
		intValue=(int)longValue;
		System.out.println(intValue);  // 500
		
		double doubleValue=3.14;
		intValue=(int)doubleValue;
		System.out.println(doubleValue);  // 3
		
	}
	
	/*
	 * 복습!!!
	 */
	static void castingExample2() {
		int a=10;
		int b=3;
		int c=a/b;
		double d=a/b; // int나누기 int
		double e=(double)a/b;
		double f=a/3.;  //3.이 실수이기때문에 a가 실수로 바뀜(실수의 기본타임 double이므로 a가 double형 됨)
		System.out.println("c: "+(double)c);
		System.out.println("d: "+d);
		System.out.println("e: "+e);
		System.out.println("f: "+f);
		
	}
	static void checkValueBeforeCastinr() {
		int i=128;
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.\n값을 다시 확인해 주세요.");
		}else {
			byte b=(byte)i;
			System.out.println("b: "+b);
		}
	}
	
	static void FromIntToFloat() {
		int num1=123456780;
		int num2=123456780;
		
		float num3=num2;  // 근사치로 변환된다.
		num2=(int)num3;
		
		int result=num1-num2;
		
		System.out.println("num1: "+num1); // 123456780
		System.out.println("num3: "+num3); // 근사치
		System.out.println("num2: "+num2); // 123456780
		System.out.println("result: "+result); //0
	}
	
	static void FromIntDouble() {
		int num1=123456780;
		int num2=123456780;
		
		double num3=num2;
		num2=(int)num3;
		
		int result=num1-num2;
		
		System.out.println("num1: "+num1); // 
		System.out.println("num3: "+num3); // 
		System.out.println("num2: "+num2); // 
		System.out.println("result: "+result); //0
	}
	
	
	public static void main(String[] args) {
		
		

//		PromotionExample();
//		CheckValueBeforeCasting();
//		GarbageValueExample();  //복습
//		floatDoublueExample();	//복습
		
//		booleanExample();
//		castingExample2();
//
//		System.out.println("===FromIntToFloat===");
//		FromIntToFloat();
//		System.out.println("===FromIntDouble===");
//		FromIntDouble();
		
		int i1=10;
		int i2=4;
		double r=i1/i2;
		System.out.println(r);
		System.exit(0);
		 
	}

}

