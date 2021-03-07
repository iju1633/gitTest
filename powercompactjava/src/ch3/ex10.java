package ch3;

public class ex10 {

	public static void main(String[] args) {

		double[] array = {1.0, 2.0, 3.0, 4.0};
		
		double sum = 0;
		double max = array[0];
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
			sum += array[i];
			if(max < array[i]) { // index를 넘지 않기 위한 조건!!
				max = array[i];
			}
		}
		System.out.println("");
		System.out.println("합은 " + sum);
		System.out.println("최대값은 " + max);
		
		
	}

}
