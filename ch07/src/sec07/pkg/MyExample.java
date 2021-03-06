package sec07.pkg;

public class MyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다형성: 자식들을 바꿔가며 쓸 수 있다.
		//단점은 자식에게만 있는 변수 사용 불가.
		// 다형성은 여기까지만 더 깊게 가지 마세요.
		
		// 부모클래스에 있는 멤버 사용 가능
		// 자식 클래스에 재정의 된 메소드 사용 가능
		// 부모클래스의 메소드 중 자식에서 재정의 된 메소드는 사용 불가
		// 자식클래스에만 있는 멤버 사용 불가. 
		Parent myParent1 = new Child01();	//부모에 있는 것 다 쓸 수 있어.
		myParent1.myMethod();	// 자식에서 재정의한 메서드 사용
//		myParent1.methodChild01();	// 자식클래스에만 있는 멤버 사용 불가. 
		
		// 자식에만 있는 멤버 사용하는 방법(Casting)
		// 자식 클래스 타입 객체에 해당 객체가 할당 된 부모객체를 자식클래스타입으로 캐스팅한다.
		Child01 myChild1= (Child01) myParent1;	// Catsting 강제 타입 변환
		
		// 자식클래스에만 있는 멤버 사용 가능
		myChild1.methodChild01();	
		// 부모클래스에 있는 멤버도 사용 가능
		int n= myChild1.myfield;
		System.out.println("Parent.myfield: "+n);
		
		
		System.out.println("----------------------");
		
		/*캐스팅 시 주의사항****
		*myParent1에는 현재 Child01타입 객체가 저장되어 있다. 얘를 Child02타입으로 캐스팅할 수 없다.
		*컴파일 오류가 아니라 실행 시 오류가 발생
		*/
//		Child02 myChild2 =(Child02) myParent1;	
//		myChild2.methodChild02();	// runtime 오류

		
		// 오류 해결 코드
		// 저장 객체의 타입 확인
		if(myParent1 instanceof Child02){
			System.out.println("if문 들어 옴");
			Child02 myChild2 =(Child02) myParent1;
		}else {
			// else문 들어 옴
			System.out.println("저장 객체가 Child02 타입의 객체가 아닙니다.");
		}
		
		
		Child01 myChild11=null;  // 사용자클래스는 자동초기화 안 된다.
		Child02 myChild22=null;
		if(myParent1 instanceof Child01){
			System.out.println("if문 들어 옴");
			myChild11 =(Child01) myParent1;
		}else if(myParent1 instanceof Child02){
			System.out.println("if문 들어 옴");
			myChild22 =(Child02) myParent1;
		}else {
			System.out.println("저장 객체가 Child01/Child02 타입의 객체가 아닙니다.");
			// return;
		}
		myChild11.myMethod();
		myChild22.methodChild02();
		
//		if(myChild11==null) System.out.println("myChild11은 null");
//		else myChild11.myMethod(); // else일 때 myChild11에 아무것도 없다. => myChild11=null; 초기화 하거나 else문에 return;써준다.

		
		
//		myParent1 = new Child02();	// Promotion 자동 타입 변환
//		myParent1.myMethod();	// 자식에서 재정의한 메소드 없으므로 부모의 메소드 사용
		
		
	}

}
