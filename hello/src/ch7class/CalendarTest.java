package ch7class;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar d = Calendar.getInstance(); // getInstance()가 객체를 생성하는 방법, 호출한 시점에서 년월일시분초를 저장함
		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR) + "년");
		System.out.println(d.get(Calendar.MONTH) + 1 + "월"); // Month는 0에서 11까지임, 배열의 index가 0부터 시작하는 거와 같이
		System.out.println(d.get(Calendar.DATE) + "일");

		System.out.println(d.get(Calendar.HOUR) + "시"); // 12시간제로 계산되서 0를 넣었을때 오전에는 0시 오후에는 12시가 출력됨
		System.out.println(d.get(Calendar.MINUTE) + "분");
		System.out.println(d.get(Calendar.SECOND) + "초");

		d.set(Calendar.HOUR, 12);
		d.set(Calendar.MINUTE, 10);
		d.set(Calendar.SECOND, 11);

		System.out.println(d);
		System.out.println(d.get(Calendar.HOUR) + "시");
		System.out.println(d.get(Calendar.MINUTE) + "분");
		System.out.println(d.get(Calendar.SECOND) + "초");

	}

}
