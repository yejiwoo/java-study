package sec04;

public class ComputerExample {

	public static void main(String[] args) {

		Calculator myCal=new Calculator();
		System.out.println(myCal.areaCircle(10));
		
		Computer myCom=new Computer();
		System.out.println(myCom.areaCircle(10));
		System.out.println(myCom.areaCircleByParent(10));
//		myCom.areaCircle(10, 10);	// 에러
//		myCom.super.areaCircle(10,10); //에러
	}

}
