package ch2Assignment;

public class EX2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� : ���� y, z, a, b�� ���� �Ʒ��� ���� 16������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		// ���� : y : �������� 8��Ʈ �̵�
		// z : ���������� 8��Ʈ �̵�
		// a : 0xf0ff And ����
		// b : 0xf0ff XOR ����

		int x = 4080;
		System.out.printf("y=0x%x", x << 8);
		System.out.println();
		System.out.printf("z=0x%x", x >> 8);
		System.out.println();
		System.out.printf("a=0x%x", x & 0xf0ff);
		System.out.println();
		System.out.printf("b=0x%x", x ^ 0xf0ff);

		// x ���� �Է¹޴� ���
		/*
		  Scanner sc = new Scanner(System.in); 
		  int x = sc.nextInt();
		  System.out.printf("y=0x%x" , x<<8); System.out.println();
		  System.out.printf("z=0x%x" , x>>8); System.out.println();
		  System.out.printf("a=0x%x" , x&8); System.out.println();
		  System.out.printf("b=0x%x" , x^8);
		 */

	}

}
