package CISC181.Week7.Queue;

//	Queue are FIFO... First In First Out	
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class cMain {

	public static void main(String[] args) {
		Queue queueA = new LinkedList();

		queueA.add("element 1");
		queueA.add("element 2");
		queueA.add("element 3");
		
		//	element() will return the first element in the 
		//	queue but not remove it
		String str1 = (String) queueA.element();
		System.out.println("First element in the queue: " + str1);
		System.out.println("QueueA Count: " + queueA.size());
		
		String str2 = (String)queueA.remove();
		System.out.println("Remove element in the queue: " + str2);
		System.out.println("QueueA Count: " + queueA.size());
		
		Iterator iterator = queueA.iterator();
		
		while (iterator.hasNext())
		{
			String element = (String) iterator.next();
			System.out.println("Remaining element: " + element);
		}
	}

}
