package CISC181.Week7.PriorityQueue;


import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Comparator<String> queueComparator = new VowelComparator();
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>(10,
				queueComparator);
		priorityQueue.add("orange");
		priorityQueue.add("fig");
		priorityQueue.add("watermelon");
		priorityQueue.add("lemon");
		while (priorityQueue.size() != 0) {
			System.out.println(priorityQueue.remove());
		}
	}
}