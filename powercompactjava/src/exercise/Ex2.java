package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		
		ArrayList<Integer> inputs =  new ArrayList<>();
		for(int i=0; i<times-1; i++) {
			int input = sc.nextInt();
			inputs.add(input);
		}
		inputs.sort(Comparator.naturalOrder());
		int answer = 0;
		for(int i=0; i<inputs.size()-1;i++) {
			if(inputs.contains(1) && (inputs.get(i+1) - inputs.get(i) == 1)) {
				answer = times;
			}
		}
		for(int i=0; i<inputs.size()-1;i++) {
			if(inputs.contains(times) && (inputs.get(i+1) - inputs.get(i) == 1)) {
				answer = 1;
			}
		}
		for(int i=0; i<inputs.size()-1;i++) {
			if(inputs.get(i+1) - inputs.get(i) != 1){
				answer = inputs.get(i) + 1;
			}
		}
		System.out.println(answer);
	}

}
