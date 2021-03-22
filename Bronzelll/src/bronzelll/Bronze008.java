package bronzelll;

import java.util.*;

public class Bronze008 { // 21분 걸림

	public static void main(String[] args) { // 생각하지 못했던 점 : width에 대해서는 4*n + 4를 어떻게 처리할 지 생각했지만, height는 고민 안했음
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int height = 0;
		int width = 0;

		if (a % 4 == 0 && b % 4 != 0) {
			height = (int) (Math.abs(4 - b % 4));
			width = (int) (Math.abs((a - 4) / 4 - (b - b % 4) / 4));
		} else if (a % 4 != 0 && b % 4 == 0) {
			height = (int) (Math.abs(4 - a % 4));
			width = (int) (Math.abs((a - a % 4) / 4 - (b - 4) / 4));
		} else if (a % 4 == 0 && b % 4 == 0) {
			height = 0;
			width = (int) (Math.abs((a - 4) / 4 - (b - 4) / 4));
		} else {
			height = (int) (Math.abs(a % 4 - b % 4));
			width = (int) (Math.abs((a - a % 4) / 4 - (b - b % 4) / 4));
		}

		System.out.println(height + width);
	}

}
