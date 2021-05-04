package question_check.q3;

public class SoundableExam {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());

	}

}
