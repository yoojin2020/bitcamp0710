package bcs.day05;

public class Method02 {

	public static void findpower(int x, int y) {
		int result = 1;
		for (int a = 1; a <= y; a++)
			result *= x;
		System.out.println(x + "��" + y + "����: " + result);
	}//�Ű������� �ְ� ��ȯ���� ���� ���(�Է¸� �ְ� ����� ����)

	public static void main(String[] args) {
		int a = 2, b = 10;
		findpower(a, b);

	}// main

	
}// class
