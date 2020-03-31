package CISC181.Week7.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

import CISC181.Week7.LinkedList.Employee;
import CISC181.Week7.LinkedList.Main;

public class HashSetDemo {
	public static void main(String args[]) {

		SimpleHashSet();
		CloneHashSet();
		ObjectHashSet();
		
		try {
			CountVowels();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void SimpleHashSet() {
		System.out.println("Start of SimpleHashSet");
		System.out.println("---------------------");
		// create a hash set
		HashSet hs = new HashSet();
		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("F");
		hs.add("F");
		hs.add("F");
		hs.add("F");
		hs.add("F");
		hs.add("F");
		System.out.println(hs);
		System.out.println("Hashset is this size: " + hs.size());

		System.out.println("---------------------");
		System.out.println("End of SimpleHashSet");
	}

	public static void CloneHashSet() {

		System.out.println("Start of CloneHashSet");
		System.out.println("---------------------");

		HashSet<String> set1 = new HashSet<String>(Arrays.asList(new String[] {
				"George", "Jim", "John", "Blake", "Kevin", "Michael" }));

		HashSet<String> set1Clone1 = (HashSet<String>) set1.clone();
		HashSet<String> set1Clone2 = (HashSet<String>) set1.clone();

		HashSet<String> set2 = new HashSet<String>(Arrays.asList(new String[] {
				"George", "Katie", "Kevin", "Michelle", "Ryan" }));

		set1.addAll(set2);
		set1Clone1.removeAll(set2);
		set1Clone2.retainAll(set2);

		System.out.println("The union of the two sets is " + set1);
		System.out.println("The difference of the two sets is " + set1Clone1);
		System.out.println("The intersection of the two sets is " + set1Clone2);

		System.out.println("---------------------");
		System.out.println("End of CloneHashSet");
	}

	
	public static void CountVowels() throws Exception {
		System.out.println("Start of CountVowels");
		System.out.println("---------------------");
		HashSet<Character> set1 = new HashSet<Character>(
				Arrays.asList(new Character[] { 'A', 'E', 'I', 'O', 'U' }));

		System.out.print("Enter a filename: ");
		Scanner input = new Scanner(System.in);
		String filename = input.nextLine();
		input = new Scanner(new java.io.File(filename));

		int countVowels = 0;
		int countConsonants = 0;

		while (input.hasNext()) {
			String s = input.nextLine().toUpperCase();
			for (int i = 0; i < s.length(); i++) {
				if (set1.contains(s.charAt(i)))
					countVowels++;
				else if (Character.isLetter(s.charAt(i)))
					countConsonants++;
			}
		}

		System.out.println("The number of vowels is " + countVowels
				+ " and consonanats is " + countConsonants);
		
		System.out.println("---------------------");
		System.out.println("End of CountVowels");
	}

	private static void ObjectHashSet() {
		ArrayList<Employee> Emps = new ArrayList<Employee>();

		Employee emp = new Employee("Bert", "R", "Gibbons",
				Main.ParseDate("1972-04-31"), "214 Labrador Lane",
				"3025551212", "myemail@mail.mil", "officeName", 50000,
				Main.ParseDate("2012-11-26"));
		Emps.add(emp);
		Employee emp2 = new Employee("Joe", "R", "Smith",
				Main.ParseDate("1972-04-31"), "123 Labrador Lane",
				"3025551212", "myemailx@mail.mil", "officeName", 50000,
				Main.ParseDate("2012-11-26"));
		Emps.add(emp2);
		Employee emp3 = new Employee("Joe", "R", "Smith",
				Main.ParseDate("1972-04-31"), "123 Labrador Lane",
				"3025551212", "myemailx@mail.mil", "officeName", 50000,
				Main.ParseDate("2012-11-26"));
		Emps.add(emp3);
		Employee emp4 = new Employee("Joe", "R", "Smith",
				Main.ParseDate("1972-04-31"), "123 Labrador Lane",
				"3025551212", "myemailx@mail.mil", "officeName", 50000,
				Main.ParseDate("2012-11-26"));
		Emps.add(emp4);
		Employee emp5 = new Employee("Joe", "R", "Smith",
				Main.ParseDate("1972-04-31"), "123 Labrador Lane",
				"3025551212", "myemailx@mail.mil", "officeName", 50000,
				Main.ParseDate("2012-11-26"));
		Emps.add(emp5);

		HashSet EmpsHS = new HashSet(Emps);

		System.out.println(EmpsHS.size());
	}
}
