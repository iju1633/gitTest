package interfaceEx;

public abstract class Predator extends Animal {
	public abstract String getFood(); // �������̽� ��Ģ, �޼ҵ��� �̸��� ����¿� ���� ���Ǹ� �ְ� �� ������ ����.
	//�� ������ �������̽��� ��Ģ�̱� �����̴�. 
	//������ ������ getFood��� �޼ҵ�� �������̽��� implements�� Ŭ�������� �����ؾ߸� �ϴ� ���̴�.
	public boolean isPredator() {
		return true;
	}
}
