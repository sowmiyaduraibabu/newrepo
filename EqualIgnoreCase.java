package day3Stringmethod;

public class EqualIgnoreCase {
	public static void main(String[] arg) {
		String word="Man";
		String word2="man";
		Boolean isnotEqual=word.equalsIgnoreCase(word2);
		System.out.println(word + " is Equal " +word2 + " = " +isnotEqual);
	}

}
