
package collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *Write a Java program to iterate a linked list in reverse order.  
 * @author SHUBHAM
 */
public class collections8 {
    // Java program to Iterate a LinkedList in Reverse Order
// using descending Iterator
	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<>();
		
		// adding elements to linked list
		linkedList.add("Computer");
		linkedList.add("Engineer");
		linkedList.add("Gpp");
		linkedList.add("2020");
		linkedList.add("2021");

		// getting an iterator which points at the
		// end of the linkedlist
		Iterator<String> iterator = linkedList.descendingIterator();

		// traversing the linkedlist
		// hasNext() will tell if previous element is
		// available or not
		// next() with descending iterator will return the
		// previous element
		// and after getting the previous element
		// is moves the cursor to next previous element.
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}

    

