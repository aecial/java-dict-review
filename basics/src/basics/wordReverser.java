package basics;
import java.util.Scanner;
public class wordReverser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Word to Reverse: ");
		String word = scan.nextLine();
		System.out.println(word.length());
		char[] reverse = new char[word.length()];
		for (int i = word.length()-1; i >= 0; i--) {
			reverse[word.length()-1 - i] = word.charAt(i);
		}
		System.out.println(reverse);

	}

}
