package ch14;

class MyRunnable implements Runnable {
	String name;
	public MyRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
		System.out.print(name + i + " ");
		}
	}
	
}

public class Ex1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable("A"));
		Thread t2 = new Thread(new MyRunnable("B"));
		Thread t3 = new Thread(new MyRunnable("C"));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
