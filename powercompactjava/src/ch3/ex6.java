package ch3;

import java.util.*;

public class ex6 {

	public static void main(String[] args) {
		System.out.print("2부터 100사이 모든 소수 :  ");
		for (int i = 2; i <= 100; i++) {
			ArrayList<Integer> factor = new ArrayList<>(); // for 안에 넣어서 반복될때마다 새로 생기게함
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					factor.add(i);
				}
			}
			if (factor.size() == 2) { // factor가 1과 자기 자신 이렇게 2개라면, prime이다
				System.out.print(i + " ");
			}
		}
	}
}
