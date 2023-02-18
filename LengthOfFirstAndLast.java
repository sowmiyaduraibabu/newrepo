package day3Stringmethod;

public class LengthOfFirstAndLast {
	public static void main(String[] args) {
		String name="Sowmiya";
		char firstLetter=name.charAt(0);
		int length=name.length();
		char lastLetter=name.charAt(length-1);
		System.out.println("first letter " +firstLetter +"\nLength: "+length + "\nlast letter " +lastLetter);
	}
}
