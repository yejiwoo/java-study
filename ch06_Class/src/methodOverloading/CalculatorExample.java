package methodOverloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCal=new Calculator();
		
		//정사각형의 넓이 구하기
		double result1=myCal.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2=myCal.areaRectangle(10, 20);
		
		//결과출력
		System.out.println("정사각형의 넓이= "+result1);
		System.out.println("직사각형의 넓이= "+result2);
	}

}
