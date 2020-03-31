package CISC181.Week7.HashMap;

import java.util.*;

import CISC181.Week7.LinkedList.Main;

public class HashMapDemo {

	public static void main(String args[]) {

		SimpleHashMap();
		ObjectHashMap();

	}

	private static void SimpleHashMap() {
		// Create a hash map
		HashMap hm = new HashMap();
		// Put elements to the map
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		hm.put("Qadir", new Double(-29.08));
		hm.put("Qadir", new Double(-39.08));
		hm.put("Qadir", new Double(-49.08));

		System.out.println("Count in hm: " + hm.size());
		// Get a set of the entries
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into Zara's account
		double balance = ((Double) hm.get("Zara")).doubleValue();
		hm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + hm.get("Zara"));
	}

	private static void ObjectHashMap() {
		Map<String, List<Employee>> map = new HashMap<String, List<Employee>>();

		Employee emp = new Employee("Bert", "R", "Gibbons",
				Main.ParseDate("1972-04-31"), "214 Labrador Lane",
				"3025551212", "myemail@mail.mil", "officeName", 50000,
				Main.ParseDate("2012-11-26"));
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(emp);
		
		map.put(emp.GetPersonID().toString(), emps);
		

	}
}