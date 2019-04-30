package FizzBuzz.src.de.uniba.wiai.dsg.ajp.uebung1.fizzbuzz;

public class FizzBuzzImpl implements FizzBuzz {

	public void printGame(int limit) {

		for (int i = 1; i <= limit; i++) {

			if (isFizzCheck(i) && isBuzzCheck(i)) {
				System.out.println("FizzBuzz");
			} else if (isFizzCheck(i)) {
				System.out.println("Fizz");
			} else if (isBuzzCheck(i)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

	private static boolean isBuzzCheck(int i) {
		return i % 5 == 0;
	}

	private static boolean isFizzCheck(int i) {
		return i % 3 == 0;
	}

}
