package BasicJava_Practice;

public class SNIPPET_Sort_Array_Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 40, 30, 20 };
		int temp = 0;

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 40>30
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Displaying elements of array after sorting
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
