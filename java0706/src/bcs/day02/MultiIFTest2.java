package bcs.day02;

import java.util.Scanner;

public class MultiIFTest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.print("���ڸ� �Է� : ");
		int count = stdin.nextInt();

		if (count < 0) 
			System.out.println("�Էµ� �� " + count + "��(��) �����Դϴ�.");
		
		else if (count >0)
			System.out.println("�Էµ� �� " + count + "��(��) ����Դϴ�.");
		
		else
			System.out.println("�Էµ� ���� 0 �Դϴ�.");
		
		stdin.close();
	}

}
