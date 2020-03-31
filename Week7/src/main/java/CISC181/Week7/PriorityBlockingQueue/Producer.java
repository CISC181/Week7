package CISC181.Week7.PriorityBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.*;

public class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    private Random Random = new Random();
    
    public void run() {
        try {
        	while (true)
        	{
        		int i = Random.nextInt(90);
        		Thread.sleep(i);
        		queue.put(i);
        		System.out.println(i + " added to the queue... Queue size: " +  queue.size());
        	}
        	/*
        	queue.add("A");
        	queue.add("B");
        	queue.add("C");
        	queue.add("D");
        	System.out.println("Item 1 on queue");
            queue.put("1");
            Thread.sleep(1000);
            System.out.println("Item 2 on queue");
            queue.put("2");
            Thread.sleep(1000);
            System.out.println("Item 3 on queue");
            queue.put("3");
            System.out.println("Item 4 on queue");
            queue.put("4");
            System.out.println("Item 5 on queue");
            queue.put("5");
            System.out.println("Item 6 on queue");
            queue.put("6");
            System.out.println("Item 7 on queue");
            queue.put("7");
            */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}