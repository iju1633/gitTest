package aboutClass;

/*
class updater {
	public void update(int count) {
		count++;
	}
	
}

public class counter {

	int count = 0;

	public static void main(String[] args) {
		
		counter Counter  = new counter();
		System.out.println("beforeCount : " + Counter.count);
		
		updater up = new updater();
		up.update(Counter.count);
		System.out.println("afterCount : " + Counter.count);
		
	}

}
*/

class updater {
	public void update(counter counter) { // 매개변수를 위와 같이 변수로 받지 않고 객체로 받으면 외부의 변수에도 영향을 줄 수 있음.
		counter.count++;
	}
	
}

public class counter {
	
	int count = 0;
	
	public static void main(String[] args) {
		
		counter Counter  = new counter();
		System.out.println("beforeCount : " + Counter.count);
		
		updater up = new updater();
		up.update(Counter);
		System.out.println("afterCount : " + Counter.count);
		
	}
	
}
