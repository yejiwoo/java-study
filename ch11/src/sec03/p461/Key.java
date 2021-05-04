package sec03.p461;

public class Key {
	//필드
	public int number;
	
	//생성자
	public Key(int number) {
		super();
		this.number = number;
	}
	
	//메소드
	@Override //overrides java.lang.Object.equals
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number) {System.out.println("같음");
			return true;
			}
		}
		System.out.println("다름");
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	
}
