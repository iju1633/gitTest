package ch13;

import java.io.*;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("C:\\Users\\82102\\OneDrive\\���� ȭ��\\memos\\input.txt");
			fin2 = new FileInputStream("C:\\Users\\82102\\OneDrive\\���� ȭ��\\memos\\input1.txt");
			
			int c1; int c2; Boolean ifSame = true ;
			while ((c1 = fin1.read()) != -1 && (c2 = fin2.read()) != -1) { // &&�߿���^^ 2���� ���ÿ� �д� ���!
				if (c1 == c2) {
					ifSame = true; // good idea!
				}
				else {ifSame = false;}
			}
			if(ifSame = true) {
				System.out.println("2���� ������ ��ġ�մϴ�."); // �� ������ �ѹ��� ��½�Ű�� ���� while ���� �ۿ� ��ġ��.
			}
			fin1.close();
			fin2.close();
		} catch (IOException e) {
			System.out.println("���� ����� ����");
		}
	}
}
