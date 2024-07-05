package BasicJava_Practice;

public class duplicateInString {

	public static void main(String[] args) {
		String str = "deepak jagtap";
		int count = 0;

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
					count++;
				}
			}
		}

	}

}
