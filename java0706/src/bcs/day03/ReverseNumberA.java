package bcs.day03;

import java.util.Scanner;

public class ReverseNumberA {

	public static void main(String[] args) {
		int a, cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� ���ڸ� �Է��ϼ���:");
		int su = scan.nextInt();
		while (true) {
			a = su % 10;
			su = su / 10;
			cnt++;
			System.out.print(a);
			if (cnt == 3)
				break;
		}
		scan.close();

	}// main end

}// class end
