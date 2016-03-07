package factorial;

public class Main {
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		for (int i = 1; i <= 21; i++) {
			System.out.println(fact.calculate(i));
		}
		System.out.println(fact.calculate(5000));
	}
}
