package edu.jspiders.multithreading.main;

import edu.jspiders.multithreading.thread.MyThread3;

public class ThreadMain3 {

	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		
		MyThread3 myThread1 = new MyThread3();
		Thread thread1 = new Thread(myThread1);
		thread1.start();
		
		MyThread3 myThread2 = new MyThread3();
		Thread thread2= new Thread(myThread2);
		thread2.start();
		
		Thread.sleep(2000);
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start - 2000+"ms");
		
		

	}

}
