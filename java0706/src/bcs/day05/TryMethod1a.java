package bcs.day05;

import java.util.Scanner;

public class TryMethod1a {
	
	static boolean check(int n) {
		if(n%2 == 0) 
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a = sc.nextInt();
		if(check(a) == true)
			System.out.println(a + "�� ¦���Դϴ�.");
		else
			System.out.println(a + "�� Ȧ���Դϴ�.");
		sc.close();

	}//main end

}//class end
