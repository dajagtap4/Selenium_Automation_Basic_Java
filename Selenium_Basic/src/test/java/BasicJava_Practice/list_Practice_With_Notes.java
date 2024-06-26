/*
 * 
List maintain the ordered collection.
can have duplicate elements. 
can store null elements in the list.
List interface is found in the java.util package,
List inherits the Collection interface,
It is a factory of ListIterator interface.


//Creating a List of type String using ArrayList  
List<String> list=new ArrayList<String>();  

//Creating a List of type Integer using ArrayList  
List<Integer> list=new ArrayList<Integer>();  

//Creating a List of type Book using ArrayList  
List<Book> list=new ArrayList<Book>();  

//Creating a List of type String using LinkedList  
List<String> list=new LinkedList<String>();
  
*/

package BasicJava_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class list_Practice_With_Notes {

	@Test(priority = 1)
	public void listForts() {

		List<String> list = new ArrayList<String>();
		list.add("Torana");
		list.add("Rajgad");
		list.add("Tung");
		list.add("Lohagad");
		list.add("Sinhagad");
		list.add("Rohida");
		list.add("Korigad");
		list.add("Tikona");
		list.add("Malhargad");
		list.add("Visapur");
		list.add("Mrugagad");
		list.add("Devgiri");

		for (String forts : list) {
			System.out.println(forts);
		}

	}

	@Test(priority = 2)
	public void converArrayToList() {
		String[] array = { "Tung", "Tikona", "Lohagad", "Visapur", "Korigad" };
		System.out.println(Arrays.toString(array));

		// Convert array to list
		List<String> list = new ArrayList<String>();
		for (String lang : array) {
			list.add(lang);
		}
		System.out.println(list);
	}

	@Test(priority = 3)
	public void sortListStrings() {
		List<String> list = new ArrayList<String>();
		list.add("Torana");
		list.add("Rajgad");
		list.add("Tung");
		list.add("Lohagad");
		list.add("Sinhagad");
		list.add("Rohida");
		list.add("Korigad");
		list.add("Tikona");
		list.add("Malhargad");
		list.add("Visapur");
		list.add("Mrugagad");
		list.add("Devgiri");

		Collections.sort(list);

		for (String forts : list) {
			System.out.println(forts);
		}
	}

	@Test(priority = 4)
	public void sortListInteger() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(43);
		list.add(11);
		list.add(84);
		list.add(50);
		list.add(97);
		list.add(55);
		list.add(01);

		Collections.sort(list);

		for (Integer numbers : list) {
			System.out.println(numbers);
		}
	}

	/*
	 * > . . . Java ListIterator Interface . . . < It is used to traverse the
	 * element in a backward and forward direction.
	 * 
	 * > declaration < public interface ListIterator<E> extends Iterator<E>
	 */

	@Test(priority = 5)
	public void listIteratorInterface() {
		List<String> list = new ArrayList<String>();
		list.add("Torana");
		list.add("Rajgad");
		list.add("Tung");
		list.add("Lohagad");
		list.add(2, "Sinhagad");
		list.add("Rohida");

		ListIterator<String> itr = list.listIterator();
		System.out.println("Traversing elements in forward direction");
		while (itr.hasNext()) {
			System.out.println("index:  " + itr.nextIndex() + "  |  value:  " + itr.next());
		}

		// Only for line formatting
		System.out.println("");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("");

		System.out.println("Traversing elements in backward direction");
		while (itr.hasPrevious()) {
			System.out.println("index:  " + itr.previousIndex() + "  |  value:  " + itr.previous());
		}
	}
}
