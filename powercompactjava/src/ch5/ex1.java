package ch5;

	class MyMetric{
		
		static void kiloToMile(double input){
			System.out.println(input +"km를 마일로 바꾸면 " + input * 0.6213881811967936); // this.input = input; 이것도 필요없음. static 에서는^^
		}
		
		static void mileToKilo(double input){
			System.out.println(input +"마일을 kilo로 바꾸면 " + input / 0.6213881811967936);
		}
	}

	
	public class ex1 {
	
		public static void main(String[] args) {
	
			// MyMetric value = new MyMetric(); static 쓰면 할 필요 없엉
			MyMetric.kiloToMile(1);
			MyMetric.mileToKilo(1);
			
		}
	
	}
