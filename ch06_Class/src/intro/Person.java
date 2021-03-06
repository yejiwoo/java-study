package intro;


// intro.ex01 패키지 내에서만 호출할 수 있다.
class Person {

	//1. 필드: Person 클래스의 속성
	public String name;	//null로 자동 초기화
	private String phoneNumber="000-0000-0000";
	int age=1;	// default: 같은 패키지 내에서만 접근 가능
	public String email;	// null로 자동 초기화
	
	
	
	//필드는 선언시 초기화 안 하면 자동으로 초기화 됨.
	// name="신상현"; // 에러
	//필드에 값 주려면 1)선언시 초기화 2)메서드 내에서 값 할당
	
	
	// DTO(Data Transaction Object??): 필드만 가진 객체 
	
	//2. 생성자	// 꼭 필요.
	public Person() {
		System.out.println("기본생성자(NoArgsConstructor) 사용"); // NoArg~: 롬복에서 사용하는 이름 
		// super(); // 자식 생성할 때 부모도 생성한다.
	}

	public Person(String name, String phoneNumber, int age, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.email = email;
		System.out.println("모든 필드를 매개변수로 갖는 생성자(AllArgsConstructor) 사용");	// AllArg~: 롬복에서 사용하는 이름 

	}
	public Person(String name, String phoneNumber, String email, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.email = email;
		System.out.println("모든 필드를 매개변수로 갖는 생성자(AllArgsConstructor) 사용");	// AllArg~: 롬복에서 사용하는 이름 

	}
	
	
	//3. 메서드
	// 반환값이 있는 메서드: return 실행문 반드시 포함
	// 반환값이 없는 메서드: return 실행문 포함될 수도 있고 안 될 수도 있다.
	public int getAge() {
		return this.age; // 명시된 값을 호출한 메서드에 반환하고 이 메서드를 종료합니다.
	}
	
	public void printName() {
		System.out.println("이름: "+this.name);
	}
	
	public void printName2() {
		System.out.println("이름: "+this.name);
		return;  // 반환값 void일 때 return 사용할 수도 있다.
	}
	
	// getter
	public String getPhoneNumber() {
		if(this.phoneNumber == null) {
			this.phoneNumber="3333-3333"; 
		}
		return this.phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
