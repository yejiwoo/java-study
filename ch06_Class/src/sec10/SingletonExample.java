package sec10;

public class SingletonExample {

	public static void main(String[] args) {
		
//		Singleton obj1=new Singleton();	//컴파일 에러: 생성자가 private이기 때문
//		Singleton obj2=new Singleton();	//컴파일 에러
		
		Singleton obj1=Singleton.getIntance();
		Singleton obj2=Singleton.getIntance();
		
		if(obj1==obj2) System.out.println("같은 객체 입니다.");
		else System.out.println("다른 객체 입니다.");
	}

}
