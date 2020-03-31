package CISC181.Week7.PriorityBlockingQueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }
    private Random Random = new Random();
    
    public void run() {
        try {
        	
        	while (true)
        	{
        		int i = Random.nextInt(100);
        		Thread.sleep(i);
        		int j = (int) queue.take();
        		System.out.println(j + " taken from the queue... Queue size: " +  queue.size());
        	}
        	
        	/*
        	Thread.sleep(5000);
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}