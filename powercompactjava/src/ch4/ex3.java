package ch4;


	class Date{
		
		int year, month, day;
		String Month;
		void print1() {
			System.out.println("\"" + year + "." + month + "." + day + "\""); // "를 출력하는 방벙 : \"
		}
		void print2() {
			System.out.println("\"" + Month + " " + day + "," + year + "\"");
		}
		
	}

	
	public class ex3 {
	
		public static void main(String[] args) {
	
			Date date = new Date();
			date.year = 2012;
			date.month = 7;
			date.Month = "July";
			date.day = 12;
			
			date.print1();
			date.print2();
		}
	
	}
