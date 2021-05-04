package sec06.package2;

import sec06.package1.A;

//A와 다른 패키지이지만 A의 자식
public class D extends A{
	
	public D() {
		this.field="value";
		this.method();
	}
	
	public void method() {
		System.out.println(field);
		method(); // A의 method() 실행 됨
	}
}
