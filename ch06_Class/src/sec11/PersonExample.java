package sec11;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		
		//final필드는 값 수정 불가
//		p1.nation="usa";
//		p1.name="을지문덕";
	}

}
