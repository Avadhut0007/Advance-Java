package edu.jspiders.multithreading.main;

import edu.jspiders.multithreading.resource.Counter;
import edu.jspiders.multithreading.thread.MyThread5;

public class ThreadMain5 {

	public static void main(String[] args) throws InterruptedException {
		
		//resource
		Counter counter = new Counter(0);
		
		MyThread5 myThread1 = new MyThread5(counter);
		
		MyThread5 myThread2 = new MyThread5(counter);
		
		
		myThread1.start();
		myThread2.start();
		
		Thread.sleep(500);
		
		System.out.println(counter.getCount());
		

	}

}
