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
	public void update(counter counter) { // �Ű������� ���� ���� ������ ���� �ʰ� ��ü�� ������ �ܺ��� �������� ������ �� �� ����.
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
