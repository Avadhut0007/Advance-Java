package edu.jspiders.multithreading.main;

import edu.jspiders.multithreading.resource.Resource;
import edu.jspiders.multithreading.thread.MyThread6;
import edu.jspiders.multithreading.thread.MyThread7;

public class ThreadMain6 {

	public static void main(String[] args) {
		
		Resource resource = new Resource();
		
		MyThread6 myThread7 = new MyThread6(resource);
		MyThread7 myThread8 = new MyThread7(resource);
		
		myThread7.start();
		myThread8.start();

	}

}
