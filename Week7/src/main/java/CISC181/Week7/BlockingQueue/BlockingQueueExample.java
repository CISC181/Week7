package CISC181.Week7.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) throws Exception {

    	// Check this out:
    	// http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
        
    	BlockingQueue queue = new ArrayBlockingQueue(100);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        //Thread.sleep(4000);
    }
}