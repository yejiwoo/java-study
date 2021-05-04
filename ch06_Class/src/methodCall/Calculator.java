package methodCall;

public class Calculator {

	private int plus(int x, int y) {
		return x+y;
	}
	
	private double avg(int x, int y) {
		double sum=plus(x,y);
		return sum/2;
	}
	
	public void execute() {
		double result=avg(7,10);
		println("실행결과: "+result);
	}
	
	private void println(String message) {
		System.out.println(message);
	}
}
