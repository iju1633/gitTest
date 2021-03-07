package ch7game;


	class Die {
		int v ;
		public Die() {
			v = 1;
		}
		int roll() {
			int max = 6;
			int min = 1;
		  int random = (int) ((Math.random() * (max - min)) + min);  // 1에서 6까지 random으로 수를 뽑는 알고리즘
		  return random;
		}
		void setValue(int v) {
			this.v = v;
		}
		int getValue() {
			return v;
		}
		public String toString() {
			return "현재 주사위 상태 : " + v;
		}
	}



	public class ex1and2 {
	
		public static void main(String[] args) {

			Die die = new Die();
			int a = die.roll();
			die.setValue(a);
			die.getValue();
			String b = die.toString();
			System.out.println(b);
		}
	
	}
