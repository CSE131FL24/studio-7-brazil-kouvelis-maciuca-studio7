package studio7;

public class Die {

	public static int randomNumberDie(int sides) {
		int numberDie = 0;
		numberDie = (int) (Math.random() * sides) + 1;
		return numberDie;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 69; i++) {
			System.out.println(randomNumberDie(i));
		}
	}
}