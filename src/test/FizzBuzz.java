package test;

public class FizzBuzz {

	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);

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
