package BasicJava_Practice;

public class SNIPPET_reverseString {

	public static void main(String[] args) {
		String string1 = "Pune";
		String string2 = "";

		// Method 1
		for(int i=0;i<string1.length();i++)
		{
			string2 = string1.charAt(i)+string2;
		}
			System.out.println(string2);

		// Method 2
        	String reverseString = new StringBuilder(string1).reverse().toString();
        	System.out.println(reverseString);
	}
}
