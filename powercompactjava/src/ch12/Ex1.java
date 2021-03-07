package ch12;

class SimplePair<T> {
	T s1, s2;
	public SimplePair(T s1, T s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	public T getFirst() {
		return s1;
	}
	public T getSecond() {
		return s2;
	}
}


public class Ex1 {
	
	public static void main(String[] args) {
		SimplePair<String> pair = new SimplePair<String>("apple", "tomato");
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
		
	}

}
