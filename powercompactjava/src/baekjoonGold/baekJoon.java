package baekjoonGold;

import java.util.*;
import java.io.*;

public class baekJoon {

	public static void main(String[] args) throws IOException { // 좌표적으로 생각해보자. 화이팅!

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tn = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(tn.nextToken());
		int W = Integer.parseInt(tn.nextToken());
		int N = Integer.parseInt(tn.nextToken());

		if (N <= H) {
			bw.write(String.valueOf((H - N) + "01"));
		} else {
			if(N > (W-1)*H) {
				
			}
		}
		bw.flush();
		bw.close();
	}
}
