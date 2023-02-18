package day3Stringmethod;

public class ExampleOFStringMethod {
	public static void main(String[] arg) {
		String name="Sowmiya karthik";
		String name1="sowmiya karthik";
		String upper=name.toUpperCase();
		String lower=name.toLowerCase();
		boolean equals=name.equals(name1);
		boolean equalsIgnoreCase=name.equalsIgnoreCase(name1);
		boolean startsWith=name.startsWith("S");
		boolean startsWith1=name.startsWith("a");
		boolean endsWith=name.endsWith("k");
		boolean endsWith1=name.endsWith("a");
		boolean contain=name1.contains("iya");
		boolean contain1=name1.contains("eya");
		int length=name1.length();
		String concat=name.concat(name1);
		int indexOf=name.indexOf("art");
		char charAt=name1.charAt(10);
		String subString=name1.substring(8,14);
		System.out.println("Upper: " +upper + "\nlower: " +lower + "\nEquals: " +equals + "\nEquals Ignore Case:" +equalsIgnoreCase + "\nStart With s :" +startsWith +"\nStart With a: " +startsWith1 + "\nEnds With k: " +endsWith + "\nEnds With a: " +endsWith1
				         + "\nContains iya: " +contain + "\nContains eya: " +contain1 + "\nLength: " +length + "\nConcat: " +concat +
				         "\nIndex OF: " +indexOf + "\nChar At: " +charAt + "\nSubString: " +subString);
        		 
	}

}
