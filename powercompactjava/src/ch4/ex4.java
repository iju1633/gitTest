package ch4;

	
	class Boksosu{
		
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
