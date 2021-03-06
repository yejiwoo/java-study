package sec03.p467;

import java.util.Arrays;

public class Member implements Cloneable{
	public String age;
	public String name;
	public int[] scores;
	public Car car;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		
		//먼저 얕은 복사를 해서 name, age를 복제한다
		Member cloned = (Member)super.clone();
		
		//scores를 깊은 복제한다.
		cloned.scores= Arrays.copyOf(this.scores,  this.scores.length);
		
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		
		//깊은 복제된 Member객체 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned=null;
		
		cloned=(Member)clone();
		
	}

}
