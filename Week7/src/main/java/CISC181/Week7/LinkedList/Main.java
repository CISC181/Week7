package CISC181.Week7.LinkedList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		SimpleLinkedList();
		ObjectLinkedList();
	}

	private static void SimpleLinkedList()
	{
		// create a linked list
	      LinkedList ll = new LinkedList();
	      // add elements to the linked list
	      ll.add("F");
	      ll.add("B");
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
	      System.out.println("Original contents of ll: " + ll);

	      // remove elements from the linked list
	      ll.remove("F");
	      ll.remove(2);
	      System.out.println("Contents of ll after deletion: "
	       + ll);
	      
	      // remove first and last elements
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("ll after deleting first and last: "
	       + ll);

	      // get and set a value
	      Object val = ll.get(2);
	      ll.set(2, (String) val + " Changed");
	      System.out.println("ll after change: " + ll);
	}
	
	private static void ObjectLinkedList()
	{
		ArrayList<Employee> Emps = new ArrayList<Employee>();
		
		Employee emp = new Employee("Bert","R","Gibbons",ParseDate("1972-04-31"),"214 Labrador Lane","3025551212","myemail@mail.mil","officeName",50000,ParseDate("2012-11-26"));
		Emps.add(emp);
		Employee emp2 = new Employee("Joe","R","Smith",ParseDate("1972-04-31"),"123 Labrador Lane","3025551212","myemailx@mail.mil","officeName",50000,ParseDate("2012-11-26"));
		Emps.add(emp2);
		
		LinkedList ll = new LinkedList(Emps);
		
		System.out.println("Original contents of ll: " + ll);
		
	}
	public static Date ParseDate(String inDate)
	{
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return dBirthDate;
	}
}
