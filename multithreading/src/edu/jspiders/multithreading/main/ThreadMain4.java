package edu.jspiders.multithreading.main;

import edu.jspiders.multithreading.thread.MyThread4;

public class ThreadMain4 {

	public static void main(String[] args) {
		
		MyThread4 thread1 = new MyThread4();
		thread1.setName("Thread 1 ");
		
		
		MyThread4 thread2 = new MyThread4();
		thread2.setName("Thread 2 ");

		
		thread1.start();
		thread2.start();
		

	}

}
