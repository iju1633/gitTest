package ch5class;

import java.util.*;

class Movie {
	String title, director;

	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}

	public void print() {
		System.out.println("{ " + title + ", " + director + " }");
	}
}

public class MovieArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Movie[] list = new Movie[2]; // ���⿡���� �迭�� �� �ڸ��� ����� �迭�� �� �ּҸ� ���� ����

		for (int i = 0; i < list.length; i++) {
			System.out.print("��ȭ���� : ");
			String title = sc.nextLine();
			System.out.print("��ȭ���� : ");
			String director = sc.nextLine();

			list[i] = new Movie(title, director); // ������� �迭 �ڸ��� ���� �ִ� ����
		}

		for (int i = 0; i < list.length; i++) {
			list[i].print(); // �̷� ����� ����, �Ʒ��� ����� ��ü�� ������ ���� �������� ���̹Ƿ� �����ؾ��Ѵٰ� �Ͻ�
			// System.out.print("{ " + list[i].title + ", " + list[i].director + " }");
		}
	}

}
