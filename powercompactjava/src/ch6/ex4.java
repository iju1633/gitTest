package ch6;


	class Sports {
		String getName() {
			return "아직 결정되지 않음";
		}
		int getPlayers() {
			return 0;
		}
		
	}
	
	class Soccer extends Sports {
		String getName(String name) {
			return name;
		}
		int getPlayers(int num) {
			return num;
		}
	}
	
	
	public class ex4 {
	
		public static void main(String[] args) {
	
			Soccer soccer = new Soccer();
			String a = soccer.getName("축구");
			int b = soccer.getPlayers(11);
			
			System.out.println("경기이름: " + a + "\n경기자수: " + b);
		}
	
	}
