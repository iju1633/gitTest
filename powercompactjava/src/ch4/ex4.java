package ch4;

	
	class Boksosu{ // class 개념이 안잡혀있고 setReal()이런 매서드를 만드는 것을 두려워했음
		
		int real, imag;
		
	
		void showResult() {
			System.out.println(real + "+" + imag + "i");
		}
	}

	
	public class ex4 {
	
		public static void main(String[] args) {
	
			Boksosu boksosu = new Boksosu();
			boksosu.real = 10;
			boksosu.imag = 20;
			
			boksosu.showResult();
			
		}
	
	}
