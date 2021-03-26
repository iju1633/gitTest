package bronzelll;

import java.math.BigInteger;
import java.util.*;

public class Bronze010 { // P가 10^100으로 굉장히 크고 Biginteger의 계산 성능도 int나 long 같은 기본 자료형에 비해 좋지 않기 때문에 시간 초과가 날 것 같네요 ㅠ

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
