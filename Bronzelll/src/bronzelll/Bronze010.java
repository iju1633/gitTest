package bronzelll;

import java.math.BigInteger;
import java.util.*;

public class Bronze010 { // P�� 10^100���� ������ ũ�� Biginteger�� ��� ���ɵ� int�� long ���� �⺻ �ڷ����� ���� ���� �ʱ� ������ �ð� �ʰ��� �� �� ���׿� ��

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger P = sc.nextBigInteger();
		int K = sc.nextInt();
		
		int[] a = new int[K];
		
		for(int i=0; i<K; i++) {
			if(a[i] == 0) continue;
			for(int j = i+i; j<K; j+=i) {
				a[j] = 0;
			}
		}
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int c : a) {
			if(c != 0) {
				b.add(c);
			}
		}
		
		
		for(int i=0; i<b.size(); i++) {
			if(P.mod(BigInteger.valueOf(b.get(i))) == BigInteger.ZERO) {
				if(a[i] < K) {
					System.out.println("BAD " + b.get(i));
				}
			}
		}

	}

}
