package sec03.p461;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key,String> hashMap =  new HashMap<Key, String>();
		
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)"로 "홍길동"을 읽어옴
		//맨 처음 hashCode로 비교해서 가져온다.
		//hashCod()가 오버라이드 되어있지 않으면 찾을 수 없기 때문에 null이 반환된다.
		//위의 new Key(1)과 아래의 new Key(1)은 다른 객체이므로 hashCode가 다르다.
		//따라서 get에서 null을 반환
		//저장할 때의 new Key(1)와 읽을 때의 new Key(1)은 사실 서로 다른 객체이지만
		//HashMap은 hashCode()의 리턴값이 같고, equals()리턴값이 true가 나오기 때문에 동등객체로 평가한다.
		String value = hashMap.get(new Key(1));  
		System.out.println(value);
	}

}
