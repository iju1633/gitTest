package bronzelll;

import java.math.BigDecimal;
import java.util.*;

public class Bronze017 { // 아는 게 없어 실패 : BigDecimal을 사용해보자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		BigDecimal a = new BigDecimal("1");
		BigDecimal b = new BigDecimal("2");
		BigDecimal c = new BigDecimal("1");
		for(int i=1; i<=N; i++) {
			a = a.multiply(b);
		}
		
		BigDecimal result = new BigDecimal("1");
		result = c.divide(a);
		
		System.out.printf("%.300f",result);
	}
}