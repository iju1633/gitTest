package ch12;

class MyMath<T> {
	public double getAverage(T[] list) { // double까지 T이면 이상하징.
		double sum = 0.0; // 초기화 중요!
		double avg;
		for(int i=0; i<list.length; i++) {
			sum += Double.parseDouble(list[i] + ""); // T[] list이므로 list값이 어떤 형인지는 모름. 그러므로 형변환해줘야해^^
		}
			avg = sum / list.length;
			return avg;
		}
	}

public class Ex2 {

	public static void main(String[] args) {
		MyMath<Integer> m = new MyMath<Integer>();
		Integer[] list = { 1, 2, 3, 4, 5, 6 };
		System.out.println(m.getAverage(list));
	}ㄴ

}
