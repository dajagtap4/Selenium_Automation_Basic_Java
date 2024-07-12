package BasicJava_Practice;

public class SNIPPET_Min_Max_Array {

	public static void main(String[] args) {

		int a[] = { 8, 4, 5, 0, 9, 7, 5, 5, 0, 1 };

		int min = a[0];
//      int Max = a[0]; // to find max nu.

		for (int i = 0; i < a.length; i++) {

//		    if (a[i] > max) to find Max nu.
			if (a[i] < min) 
			{
				min = a[i];
			}
		}
		System.out.println(min);
//      System.out.println(max);  //  to find max nu.
	}

}
