package ch6;


	class Sports {
		String getName() {
			return "���� �������� ����";
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
			String a = soccer.getName("�౸");
			int b = soccer.getPlayers(11);
			
			System.out.println("����̸�: " + a + "\n����ڼ�: " + b);
		}
	
	}
