package CISC181.Week7.PriorityBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class PriorityBlockingQueueExample {

    public static void main(String[] args) throws Exception {

    	BlockingQueue queue   = new PriorityBlockingQueue();


        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}
