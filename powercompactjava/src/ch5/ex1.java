package ch5;

	class MyMetric{
		
		static void kiloToMile(double input){
			System.out.println(input +"km�� ���Ϸ� �ٲٸ� " + input * 0.6213881811967936); // this.input = input; �̰͵� �ʿ����. static ������^^
		}
		
		static void mileToKilo(double input){
			System.out.println(input +"������ kilo�� �ٲٸ� " + input / 0.6213881811967936);
		}
	}

	
	public class ex1 {
	
		public static void main(String[] args) {
	
			// MyMetric value = new MyMetric(); static ���� �� �ʿ� ����
			MyMetric.kiloToMile(1);
			MyMetric.mileToKilo(1);
			
		}
	
	}
