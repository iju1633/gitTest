package ch12;

class MyMath<T> {
	public double getAverage(T[] list) { // double���� T�̸� �̻���¡.
		double sum = 0.0; // �ʱ�ȭ �߿�!
		double avg;
		for(int i=0; i<list.length; i++) {
			sum += Double.parseDouble(list[i] + ""); // T[] list�̹Ƿ� list���� � �������� ��. �׷��Ƿ� ����ȯ�������^^
		}
			avg = sum / list.length;
			return avg;
		}
	}

public class Ex2 {

	public static void main(String[] args) {
		MyMath<Integer> m = new MyMath<Integer>();
		Integer[] list = { 1, 2, 3, 4, 5, 6 };
		System.out.println(m.getAverage(list));
	}��

}
