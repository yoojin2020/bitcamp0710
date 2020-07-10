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
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		if(check(a) == true)
			System.out.println(a + "는 짝수입니다.");
		else
			System.out.println(a + "는 홀수입니다.");
		sc.close();

	}//main end

}//class end
