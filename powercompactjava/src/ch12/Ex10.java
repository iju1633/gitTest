package ch12;

import java.util.*;

class RandomList<T> {
	ArrayList<T> array = new ArrayList<T>();

		public void add(T item) { // 여기 형식들을 잘 기억하자
			array.add(item);
		}

		public T select() {

			int index = (int)(Math.random()*array.size());
			T result = array.get(index);
			return result;
			
		}
}

public class Ex10 {
	
	public static <T> void main(String[] args) {
		
		RandomList<String> a1 = new RandomList<>();
		RandomList<Integer> a2 = new RandomList<>();
		a1.add("널 사랑해");
		a1.add("I love you");
		a2.add(3000);
		a2.add(5000);
		
		String str = a1.select();
		int num = a2.select();
		
		System.out.println(str);
		System.out.print(num);
	}

}
