package ch2class;

public class Ex2by12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0x0fff;
		int y = 0xfff0;
		int z = -16;
		
		System.out.printf("%x ", x&y);
		System.out.printf("%x ", x|y);
		System.out.printf("%x ", x^y);
		System.out.printf("%x ", ~x);
		System.out.printf("%d ", y>>8); // 8��Ʈ�� 1����Ʈ : https://coding-factory.tistory.com/521 ����
		System.out.printf("%x ", z>>3); // ������ 1, ����� 0���� ä��
		System.out.printf("%x ", z>>>3); // 0���� ä��
		// ��ȣ ��Ʈ >> << >>> �� �� �˾ƺ� ��. ���� Ȯ���� �� -> �ذ�!
	}

}
