package sec04;

public class Calculator {

	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areCircle() 실행");
		return 3.14159 * r* r;
	}
	
	double areaCircle(double r, double a) {
		System.out.println("Calculator 객체의 areCircle(a) 실행");
		return 3.14159 * r* a;
	}
}
