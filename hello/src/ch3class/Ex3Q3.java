package ch3class;

import java.util.*;
public class Ex3Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ö��");
		list.add("����");
		list.add("����");
		list.add("�ڿ�");
		
		for(String obj : list) {
			System.out.print(obj + " ");
		}
	}

}
