package bcs.day03;

import java.util.Scanner;

public class NestedLoofTest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("���ϴ� ���ڸ� �Է��ϼ��� : ");
		
		int num = stdin.nextInt();
		int i = 1;
		stdin.close();

		while (i <= num) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		

	}// main end

}// class end
