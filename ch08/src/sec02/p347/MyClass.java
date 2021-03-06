package sec02.p347;

public class MyClass {
	
	//필드
	RemoteControl rc = new Television();
	
	// 생성자
	MyClass(RemoteControl rc){
		this.rc = rc;
	}
	
	//Getter Setter
	public RemoteControl getRc() {
		return rc;
	}

	public void setRc(RemoteControl rc) {
		this.rc = rc;
	}
	
	
	
	//메소드
	void methodA() {
		//로컬변수
		RemoteControl rc = new Audio();
		rc.setVolume(9);
	}

	void methodB(RemoteControl rc) {	//위의 것보다 이걸 더 많이 쓴다용~!
		
		//매개변수 사용
		rc.setVolume(99);
	}
	
	
	// 다른 클래스에서 MyClass의 methodB사용할 때는
	// 다음처럼 코드 작성
	public static void main(String[] args) {
		MyClass mc = new MyClass(new Audio());
		
		mc.rc.setVolume(10);
		mc.methodA();
		mc.methodB(new Television());
	}
}
