import java.util.Scanner;
import static java.lang.System.*;
public class BadInputTest extends Operators {
	private static String[] badWords = {"fuck","shit","ass","cunt","bitch"};
	public static void main(String[] args) {
		Scanner kb = new Scanner(in);
		String word = kb.nextLine();
		try {
			wordCheck(badWords, word);
		}
		catch(BadInputException e) {
			System.out.println(e.getMessage());
		}
		kb.close();
	}
	public static void wordCheck(String[] words, String w) throws BadInputException {
		if(searchString(words,w.toLowerCase())!=-1) {
			throw new BadInputException("This is not an okay word: "+ w);
		}
		else {
			System.out.println("Nice Word");
		}
	}

}
