package sec02.p347;

public class RemoteControlExample {

	public static void main(String[] args) {

		//354p
		Television tv=new Television(); //인터페이스 사용하지 x
		
		/*
		 * 인터페이스 구현 객체 사용 방법
		 *  : 인터페이스 변수에 구현 객체 대입
		 */
		RemoteControl rc=null;
		
		rc=new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(true);
		
		System.out.println("---------");
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc.setMute(false);

		System.out.println("---------");
		RemoteControl.changeBattery();
		
		int intVal1 = (int)3.5;	// 3
		double doubVal = 1.2;
		intVal1 = (int) doubVal; // 1

		int intVal2 = 5;
		doubVal = intVal1 + intVal2; // 6.0: promotion
		
	}

}
