package bcs.day03;

import java.util.Scanner;
public class WhileTest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		int dan = stdin.nextInt();
		int x = 1;
		while(x<10) {
			System.out.println(dan+ " * " +x+ " = " +dan*x);
			x++;
		}
		
		stdin.close();

	}// main end

}// class end
