package edu.jspiders.multithreading.main;

import edu.jspiders.multithreading.thread.MyThread2;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		
		MyThread2 myThread1 = new MyThread2();
		myThread1.start();
		
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
		
		Thread.sleep(2000);
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start - 2000+"ms");
		

	}

}
