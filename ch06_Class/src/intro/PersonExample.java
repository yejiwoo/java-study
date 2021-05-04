package intro;

public class PersonExample {

   public static void main(String[] args) {
      
      //로컬변수인데 사용자 클래스타입의 로컬변수
      Person myPerson1 = new Person();//객체생성
      //name, email: null
      //age: 1
      //phneNumber: 000-0000-0000
      
      //myPerson1.phoneNumber = "222-2222-2222";  //private 접근제어 이므로 컴파일 오류
      myPerson1.age = 17 ;
      System.out.println("이름: "+ myPerson1.name);
      System.out.println("나이: "+ myPerson1.age);
      //Person.age = 35;
      
      
      Person myPerson2 = new Person("신상현", "555-5555-5555", 45, "구트@구트닷컴");


      //String myPhoneNumber = myPerson2.phoneNumber; //The field Person.phoneNumber is not visible
      String myPhoneNumber = myPerson2.getPhoneNumber();
      System.out.println("myPerson2.phoneNumber:" + myPhoneNumber);
      
      
      
      
      //Person myPerson3 = new Person("신상현"); //컴파일 오류, Person 클래스에 해당 생성자가 없어서
      

   }

}