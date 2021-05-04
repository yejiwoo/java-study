package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("모델: "+dmbCellPhone.color);
		System.out.println("모델: "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		
		dmbCellPhone.changeCahneelDmb(5);
	}

}
