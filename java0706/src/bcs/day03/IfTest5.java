package bcs.day03;

public class IfTest5 {

	public static void main(String[] args) {
		int a = 5, b = 9, c = 12; // 세개의 수가 주어짐
		int temp = 0; // temp는 빈컵역할

		// 문제)if문을 써서 세개의 숫자 중 제일 큰 수를 temp에 담아 출력하세요.

		if (a > b) 
			temp = a;
		else
			temp = b;
		
		if (c > temp)
			temp = c;

		System.out.println(a + " " + b + " " + c);
		System.out.println("최대값 = " + temp);
	}

}
