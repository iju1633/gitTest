package aboutClass;

public class HouseDog extends Dog{
	
	public HouseDog(String name) { // constructor(������) ����, �޼ҵ���� Ŭ������� �����ϰ� ���� �ڷ����� ���� �޼ҵ带 ������(Constructor)��� ���Ѵ�.
		this.setName(name);
	}
	
	public HouseDog(int type) {
		if(type == 1) {
			this.setName("yok");
			System.out.println(this.name);
		}
		if(type == 2) {
			this.setName("bulldog");
			System.out.println(this.name);
		}
	}
	
	public void sleep() { // overriding
		System.out.println(this.name + "...zzz in house");
	}
	public void sleep(int hours) {
		System.out.println(this.name + "sleeps for " + hours + " hour"); //�Է��׸��� �ٸ� ��� �̿� ���� �޼��� �������̵� �� �� ����.
	}

	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("puppy"); // �̷��� �����ڸ� ������� �� ��� �Ǵ� �̵��� setName("happy")�� ���� 
		// �ʼ����� �ൿ�� ��ü �����ÿ� ������ �� �ְ� �ȴٴ� ���̴�.
		
		System.out.println(houseDog.name); // �ٷ� �� ���忡�� houseDog��� ��ü�� ������µ� �װ� �̿��ؾ����Ѥ� �򰥸�����
		
		HouseDog bulldog = new HouseDog(2);
	}
	// �׷��ٸ� name�̶�� ������ ������ �־�߸� ��ü�� ������ �� �ֵ��� �� �� �ִ� ����� ������?  -> constructor ������ �ִ�.
}
