package bcs.day04;

public class TryArray03a {

	public static void main(String[] args) {
		int a = 5, b = 10, c = 4, d = 2, e = 8, f = 5;
		int[] su = { 5, 10, 4, 2, 8, 5 };
		int hap = 0, tot = 0;
		// 문제1) 위와 같이 주어졌을 때 hap에는 a~f까지의 합을,
		// tot에는 for문을 사용하여 배열(su) 값의 총합을 구하여
		// hap=xx
		// tot=xx 의 형식으로 출력하세요
		hap = a + b + c + d + e + f;
		for (int i = 0; i < su.length; i++) {
			tot += su[i]; // 대입연산
		}

		System.out.println("hap=" + hap);
		System.out.println("tot=" + tot);

	}// main end

}// class end
