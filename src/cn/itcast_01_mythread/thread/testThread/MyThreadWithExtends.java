package cn.itcast_01_mythread.thread.testThread;

public class MyThreadWithExtends extends Thread {

	@Override
	public void run() {
		System.out.println("线程的run方法被调用……");
	}

	public static void main(String[] args) {
		Thread thread = new MyThreadWithExtends();
		thread.start();
	}
}
