package bronzelll;

import java.math.BigInteger;
import java.util.*;

public class Bronze003 { // 1시간 소요(개념을 새로 익힘)

	public static void main(String[] args) { // 9223372036854775807가 unsigned long long 크기의 반에서 -1한 값임. 자바에서는 long에 해당!!
											 // 런타임 에러! ( 두 수를 더하거나 음수의 경우 빼게 되면 long 범위를 넘어감! 이럴 땐 BigInteger(무한대수) 사용해야햠, 실수의 경우 BigDecimal도 존재!
											 // Scanner sc = new Scanner(System.in); 이걸 for문 안에 두면 객체를 여러번 생성하는 것임.
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
