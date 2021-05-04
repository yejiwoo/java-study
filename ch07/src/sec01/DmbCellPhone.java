package sec01;

public class DmbCellPhone extends CellPhone{
	//field
	int channel;

	//constructor
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color); //부모객체생성. 써주지 않으면 컴파일러에 의해 super()가 자동 추가
		this.channel = channel;
	}

	//method
	void changeCahneelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 "+channel+"번으로 바꿉니다.");
	}
	

}
