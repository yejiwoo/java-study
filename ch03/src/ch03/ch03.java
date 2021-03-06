package ch03;

public class ch03 {

	// 단항 연산자
	static void SignOperatorExample() {
		int x=-100;
		int result1=+x;  // +x는 x와 같다. 따라서 -100
		int result2=-x;  // 100
		System.out.println("result1: "+result1);  //-100
		System.out.println("result2: "+result2);	//100
		
		short s=100;
		//short result3= -s; // 컴파일 에러. 왜냐하면 부호연산자의 산출 타입은 int
		int result3=-s;
		System.out.println("result3: "+result3);	//-100
	}
	
	// 증감 연산자
	static void increaseDecreaseOperatorExample() {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("-----------------");
		x++;
		++x;
		System.out.println("x= "+x);	//12
		
		System.out.println("-----------------");
		y--;--y;
		System.out.println("y= "+y);	//8
		
		System.out.println("-----------------");
		z= x++;
		System.out.println("z= "+z);	//12
		System.out.println("x= "+x);	//13
		
		System.out.println("-------------------");
		z=++x;
		System.out.println("z= "+z);	//14
		System.out.println("x= "+x);	//12
		
		System.out.println("-------------------");
		z=++x + y++;
		System.out.println("z= "+z);	// 23
		System.out.println("x= "+x);	//15
		System.out.println("y= "+y);	//9
		
	}
	
	// 산술 연산자
	static void ArithmeticOperatorExample(){
		int v1=5;
		int v2=2;
		
		int result1=v1/v2;
		System.out.println("v1/v2= "+result1); 	//2
		
		double result2=(double)v1 / v2;	// v1을 double형으로 강제 타입 변환(캐스팅)한 수 산술 연산
		System.out.println("(double)v1/v2= "+result2);	//2.5
		
		double result3=v1 / (double)v2;	// v2를 double형으로 강제 타입 변환(캐스팅)한 수 산술 연산
		System.out.println("v1/(double)v2= "+result3);	//2.5
		
		double result4= v1*1.0 / v2;	// v1에 1.0을 곱하여 실수 타입으로 만든 후 산술 연산
		System.out.println("v1*1.0 / v2= "+result4);	//2.5
	}
	
	//char 타입 연산
	static void CharOperationExample() {
		char c1='A' +1;
		char c2='A';
		//char c3 = c2+1;	// 컴파일 에러: c2에 1을 더하면 c2는 int타입으로 변환되고 1과 연산되기 때문에 산출타입이 int가 된다. 따라서 c3에 대입할 수 없다.
		System.out.println("c1= "+c1);	//B
		System.out.println("c2= "+c2);	//A
		
	}
	
	// 오버플로우
	static void OverflowExample() {
		int x =1000000;
		int y=1000000;
		int z= x*y;
		System.out.println(z);	//-7237379968: 오버플로우 발생
		
		
		// 오버플로우 해결
		long x2=1000000;
		long y2=1000000;
		long z2=x2*y2;
		
		System.out.println(z2);	//1000000000000
	}
	
	static int safeAdd(int left, int right) {
		if(right>0) {
			if(left > Integer.MAX_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		else{
			if(left < Integer.MIN_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left+right;
	}
	static void CheckoverflowExample() {
		try {
			int result=safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 게산할 수 없음.");
		}
	}
	
	// 정확하게 계산할 때에는 부동소수점 타입을 사용하지 않는다.
	static void AccuracyExample1() {
		int apple =1 ;
		double pieceUnit = 0.1;
		int number=7;
		
		double result=apple - number * pieceUnit;
		System.out.println(number*pieceUnit);
		System.out.println("사과 한 개에서 0.7 조각을 빼면\n"+result+"조각이 남는다.");	//0.29999999999993
	}
	
	static void AccuracyExample2() {
		int apple=1;
		
		int totalPieces=apple*10;
		int number=7;
		int temp=totalPieces - number;
		
		double result=temp/10.;
		
		System.out.println("사과 한 개에서 0.7 조각을 빼면\n"+result+"조각이 남는다.");	//0.3
	}
	
	// Infinity와 NaN
	static void InfinityAndNaNCheckExample() {
		int x=5;
		double y=0.0;
		
		double z=x/y;
		
		System.out.println(Double.isInfinite(z));	// true
		System.out.println(Double.isNaN(z));		//false
		
		z=x%y;
		System.out.println(Double.isInfinite(z));	//false
		System.out.println(Double.isNaN(z));		//true
		
		System.out.println(z+2); 	// 문제가 되는 코드	//NaN
	}
	
	// "NaN" 문자열의 문제점
	static void InputDataCheckNaNExample1() {
		String userInput="NaN";
		double val=Double.valueOf(userInput);	// "NaN"문자열은 Double.valueOf()메소드에 의해 double타입으로 변환되면 NaN이 된다.
		
		double currentBalance=10000.0;
		currentBalance+=val;
		System.out.println(currentBalance);
		
	}
	
	// "NaN"을 체크하고 연산 수행
	static void InputDataCheckNaNExample2() {
		String userInput="NaN";
		double val=Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입려되어 처리할 수 없음");
			val=0.0;
		}
		
		currentBalance+=val;
		System.out.println(currentBalance);
	}
	
	// 문자열 연결 연산자
	static void StringConcatExample() {
		String str1="JDK"+6.0;
		String str2=str1+"특징";
		System.out.println(str2);	//JDK6.0특징
		
		String str3="JDK"+3+3.0;
		String str4=3+3.0+"JDK";
		System.out.println(str3);	// JDK33.0
		System.out.println(str4);	// 6.0JDK
		
	}
	
	// 비교 연산자 2
	static void CompareOperatorExample2() {
		int v2=1;
		double v3=1.0;
		System.out.println(v2==v3);	// true: int타입인 3을 보다 큰 타입인 double타입으로 변환한 다음 비교
		
		double v4=0.1;
		float v5=0.1f;
		System.out.println(v4==v5);		// false: 부동소수점 타입은 0.1을 정확히 표현할 수 없어서 0.1f는 0.1의 근사값으로 표현 된다.
		System.out.println((float)v4==v5);		//true
		System.out.println((int)v4*10 == (int)v5*10);	//true
		System.out.println((int)v4 == (int)v5);		//true
	}
	
	// 문자열 비교
	static void StringEqualsExample() {
		String str1="신민철";
		String str2="신민철";
		String str3= new String("신민철");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str2));
		
		System.out.println("str1메모리주소: "+System.identityHashCode(str1));
		System.out.println("str2메모리주소: "+System.identityHashCode(str2));
		System.out.println("str3메모리주소: "+System.identityHashCode(str3));
		System.out.println("str1.hashCode()"+str1.hashCode());
		System.out.println("str2.hashCode()"+str2.hashCode());
		System.out.println("str3.hashCode()"+str3.hashCode());
	}
	
	public static void main(String[] args) {

//		SignOperatorExample();
//		increaseDecreaseOperatorExample();
//		ArithmeticOperatorExample();
//		CharOperationExample();
//		OverflowExample();
//		CheckoverflowExample();
//		AccuracyExample1();
//		AccuracyExample2();
//		InfinityAndNaNCheckExample();
//		InputDataCheckNaNExample1();
//		InputDataCheckNaNExample2();
//		StringConcatExample();
//		CompareOperatorExample2();
//		StringEqualsExample();
		int[] i=null;
		System.out.println(i);
	}

}
