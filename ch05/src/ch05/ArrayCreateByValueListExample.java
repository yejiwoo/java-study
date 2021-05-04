package ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores;
		scores=new int[] {83, 90, 87};	// 길이 변경 불가
		int sum1=0;
		for(int score: scores) {
			sum1+=score;
		}
		System.out.println("총합: "+sum1);
		
		int sum2=add(new int[] {83,90,87});
		//int sum2=add(scores); // 위의 것과 동일
		System.out.println("총합: "+sum2);
		
	}

	public static int add(int[] scores) {
		int sum=0;
		for(int score: scores) sum+=score;
		return sum;
	}
}
