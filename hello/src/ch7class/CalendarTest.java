package ch7class;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar d = Calendar.getInstance(); // getInstance()�� ��ü�� �����ϴ� ���, ȣ���� �������� ����Ͻú��ʸ� ������
		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR) + "��");
		System.out.println(d.get(Calendar.MONTH) + 1 + "��"); // Month�� 0���� 11������, �迭�� index�� 0���� �����ϴ� �ſ� ����
		System.out.println(d.get(Calendar.DATE) + "��");

		System.out.println(d.get(Calendar.HOUR) + "��"); // 12�ð����� ���Ǽ� 0�� �־����� �������� 0�� ���Ŀ��� 12�ð� ��µ�
		System.out.println(d.get(Calendar.MINUTE) + "��");
		System.out.println(d.get(Calendar.SECOND) + "��");

		d.set(Calendar.HOUR, 12);
		d.set(Calendar.MINUTE, 10);
		d.set(Calendar.SECOND, 11);

		System.out.println(d);
		System.out.println(d.get(Calendar.HOUR) + "��");
		System.out.println(d.get(Calendar.MINUTE) + "��");
		System.out.println(d.get(Calendar.SECOND) + "��");

	}

}
