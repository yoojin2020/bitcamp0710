package bcs.day04;

public class TryArray05a {

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

		double sum = 0.0;

		for (int k = 0; k < 4; k++) { // 행
			for (int j = 0; j < 2; j++) { // 열 k=0일때 j=0,1
				sum = sum + score[k][j];
			} // j end
		} // k end

		// 문제3) 총점까지 구했으니 이제 마지막으로 score의 평균 점수(avg)를 구하려고 합니다.
		// 배열(score)의 행의 길이(row)와 열의 길이(col)를 먼저 구하고,
		// 행과 열의 길이를 통해 전체 데이터의 갯수(cnt)를 구한 후, 평균(avg)을 구해 출력하세요.
		int row, col, cnt;
		double avg = 0.0;

		row = score.length;
		col = score[2].length;
		
		cnt = row * col;
		avg = sum/cnt;

		System.out.println("hap=" + hap);
		System.out.println("tot=" + tot);
		System.out.println("sum=" + sum);
		System.out.printf("avg=%3.1f", avg);

	}// main end

}// class end
