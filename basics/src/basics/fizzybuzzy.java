package basics;

public class fizzybuzzy {
	public static String fizzBuzz(int num) {
		if (num % 2 == 0) {
			return String.valueOf("'"+num+"'");
		} else if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else {
			if (num % 3 == 0) {
				return "Fizz";
			} else {
				return "Buzz";
			}
		}
		
	}

	public static void main(String[] args) {
		
		System.out.print(fizzBuzz(15));

	}

}
