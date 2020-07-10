package bcs.day05;

import java.util.Scanner;

public class TryMethod1 {
	
	//main 메소드에서 키보드를 통해 숫자 하나를 입력 받고,
	//그 숫자를 check() 함수에 전달하여 짝수인지 홀수인지 결과값을 리턴 받은 후
	//"a는 짝수입니다." 또는 "a는 홀수입니다." 의 형식으로 출력하려고 합니다.
	//아래의 메소드를 완성하세요(리턴타입, 매개변수, 홀짝 판별식 추가)
	static boolean check(int x) {
		if(x%2==0)
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
