package bronzelll;

import java.math.BigInteger;
import java.util.*;

public class Bronze010 { // P가 10^100으로 굉장히 크고 Biginteger의 계산 성능도 int나 long 같은 기본 자료형에 비해 좋지 않기 때문에 시간 초과가 날 것 같네요 ㅠ

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger P = sc.nextBigInteger(); // 두 개의 소수로 곱해진 결과값인 P와 인수와 비교할 K를 입력받는다
		BigInteger K = sc.nextBigInteger();

		BigInteger p = BigInteger.ZERO; // P의 인수 2개를 담을 변수 선언한다
		BigInteger q = BigInteger.ZERO;

		for (BigInteger j = BigInteger.TWO; j.compareTo(P) == -1; j = j.add(BigInteger.ONE)) { // j를 2부터 P보다 작은 수까지 1씩 더해가며 P가 j로 나눠지는지 확인한다
			if (P.mod(j) == BigInteger.ZERO) { // 나눠진다면 j가 P의 인수이고 P를 j로 나눈 값은 P의 또다른 인수이다
				p = j;
				q = P.divide(j);
				break;
			}
		}

		if (p.compareTo(K) == 1 && q.compareTo(K) == 1) { //p와 q를 K와 비교하며 K보다 작은 것이 하나라도 있다면 BAD와 그 인수를 출력하고 둘다 K보다 크다면 GOOD을 출력한다
			System.out.println("GOOD");
		} else if (p.compareTo(K) == -1 && q.compareTo(K) == 1) {
			System.out.println("BAD " + p);
		} else if (p.compareTo(K) == 1 && q.compareTo(K) == -1) {
			System.out.println("BAD " + q);
		}

	}

}
