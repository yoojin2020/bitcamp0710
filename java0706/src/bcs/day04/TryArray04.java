package bcs.day04;

public class TryArray04 {

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

		// 문제2) 문제1에서 2차원 배열이 추가되었습니다.
		// 이번에는 sum에 중첩 for문을 사용하여 배열(score)의 각각의 값을 더해서 
		// 총합을 구한 다음 아래에 출력하세요.
		double score[][] = { // 4행x2열의 2차원 배열
				{ 3.3, 3.4 }, // 1학년 1, 2학기 평점
				{ 3.5, 3.6 }, // 2학년 1, 2학기 평점
				{ 3.7, 4.0 }, // 3학년 1, 2학기 평점
				{ 4.1, 4.2 } // 4학년 1, 2학기 평점
		};
		
		double sum=0.0;
		
		//이곳에 중첩for문 작성
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<2 ; j++)
				sum = sum + score[i][j];
		}
			
		
		System.out.println("hap=" + hap);
		System.out.println("tot=" + tot);
		System.out.println("sum=" + sum);

	}// main end

}// class end
