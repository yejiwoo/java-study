package sec07.pkg;

public class Child01 extends Parent{
	
	int childfield01=20;
	
	public void methodChild01() {
		System.out.println("child01에 있는 메서드");
	}
	
	@Override
	public void myMethod() {
		System.out.println("부모에 있는 메서드를 자식이 재정의");
	}
}
