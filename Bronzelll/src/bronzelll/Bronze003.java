package bronzelll;

import java.math.BigInteger;
import java.util.*;

public class Bronze003 { // 1�ð� �ҿ�(������ ���� ����)

	public static void main(String[] args) { // 9223372036854775807�� unsigned long long ũ���� �ݿ��� -1�� ����. �ڹٿ����� long�� �ش�!!
											 // ��Ÿ�� ����! ( �� ���� ���ϰų� ������ ��� ���� �Ǹ� long ������ �Ѿ! �̷� �� BigInteger(���Ѵ��) ����ؾ��t, �Ǽ��� ��� BigDecimal�� ����!
											 // Scanner sc = new Scanner(System.in); �̰� for�� �ȿ� �θ� ��ü�� ������ �����ϴ� ����.
		String[] result = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for (int k = 0; k < 3; k++) {
			int N = sc.nextInt();
			BigInteger sum = BigInteger.ZERO;
			for (int i = 0; i < N; i++) {
				BigInteger a = sc.nextBigInteger();
				sum = sum.add(a);
			}
			if (sum.compareTo(BigInteger.ZERO) == 0) {
				result[k] = "0";
			} else if (sum.compareTo(BigInteger.ZERO) == -1) {
				result[k] = "-";
			} else
				result[k] = "+";
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
