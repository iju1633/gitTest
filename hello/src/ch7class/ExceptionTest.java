package ch7class;

public class ExceptionTest {

	public static void main(String[] args) {
		// Integer obj = new Integer(100); �̷��� ���� �� �������� ����
		Integer obj = 100;
		obj = 20;
		System.out.println(obj + 1);

		Integer[] iarr = new Integer[2];

		iarr[0] = new Integer(10); // �̷��� ���� �� �������� ����
		iarr[1] = 20;

		int arr[] = { 1, 2, 3, 6, 9, 7 };

		try {
			for (int i = 0; i <= arr.length; i++) { // length���� ++�ϸ� index �ʰ��� ��� �׷��Ƿ� catch�������� ���� for�� �Ʒ��� "���"�� ��µ���
													// �ʴ´�
				System.out.print(arr[i] + " ");
			}
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("���� �߻�");
		} finally {
			System.out.println("���� ó��");
		}
	}

}
