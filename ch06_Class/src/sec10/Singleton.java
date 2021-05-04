package sec10;

public class Singleton {
	
	// 정적 필드
	private static Singleton singleton=new Singleton();
	
	//생성자
	private Singleton() {}
	
	//정적메서드
	public static Singleton getIntance() {
		return singleton;
	}
}
