package ch3;

public class ex10 {

	public static void main(String[] args) {

		double[] array = {1.0, 2.0, 3.0, 4.0};
		
		double sum = 0;
		double max = array[0];
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
			sum += array[i];
			if(max < array[i]) { // index�� ���� �ʱ� ���� ����!!
				max = array[i];
			}
		}
		System.out.println("");
		System.out.println("���� " + sum);
		System.out.println("�ִ밪�� " + max);
		
		
	}

}
