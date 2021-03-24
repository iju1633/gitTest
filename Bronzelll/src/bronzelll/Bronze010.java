package bronzelll;

import java.math.BigInteger;
import java.util.*;

public class Bronze010 { // P�� 10^100���� ������ ũ�� Biginteger�� ��� ���ɵ� int�� long ���� �⺻ �ڷ����� ���� ���� �ʱ� ������ �ð� �ʰ��� �� �� ���׿� ��

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger P = sc.nextBigInteger(); // �� ���� �Ҽ��� ������ ������� P�� �μ��� ���� K�� �Է¹޴´�
		BigInteger K = sc.nextBigInteger();

		BigInteger p = BigInteger.ZERO; // P�� �μ� 2���� ���� ���� �����Ѵ�
		BigInteger q = BigInteger.ZERO;

		for (BigInteger j = BigInteger.TWO; j.compareTo(P) == -1; j = j.add(BigInteger.ONE)) { // j�� 2���� P���� ���� ������ 1�� ���ذ��� P�� j�� ���������� Ȯ���Ѵ�
			if (P.mod(j) == BigInteger.ZERO) { // �������ٸ� j�� P�� �μ��̰� P�� j�� ���� ���� P�� �Ǵٸ� �μ��̴�
				p = j;
				q = P.divide(j);
				break;
			}
		}

		if (p.compareTo(K) == 1 && q.compareTo(K) == 1) { //p�� q�� K�� ���ϸ� K���� ���� ���� �ϳ��� �ִٸ� BAD�� �� �μ��� ����ϰ� �Ѵ� K���� ũ�ٸ� GOOD�� ����Ѵ�
			System.out.println("GOOD");
		} else if (p.compareTo(K) == -1 && q.compareTo(K) == 1) {
			System.out.println("BAD " + p);
		} else if (p.compareTo(K) == 1 && q.compareTo(K) == -1) {
			System.out.println("BAD " + q);
		}

	}

}
