package bcs.day02;

public class IfTest2 {

	public static void main(String[] args) {
		// kor: 국어성적, eng: 영어성적, sum: 성적합계, avg: 성적평균
		int kor = 90, eng = 85, sum = 0;
		double avg = 0.0;
		String name = "홍길동";
		// 문제 1. 성적의 합과 평균을 구하는 식을 완성하시오.
		sum = (kor + eng);
		avg = (double) sum / 2;

		// 문제2. if문을 사용해서 평균이 70점 이상이면 '축합격', 0~69점은 '재시험'이라는 안내 메시지를
		// 결과에 출력하세요.
		String msg = "안내문을 여기에 작성";

		if (avg >= 70)
			msg = "축합격";
		else
			msg = "재시험";

		// 문제3. if문을 사용해서 학점(grade)을 구하세요.
		// 평균이 100~90-> A, 80~89-> B, 70~79-> C, 60~69-> D, 59~0-> F
		char grade = 'F'; // 학점을 F로 초기화

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else 
			grade = 'F';

		System.out.println("이름=" + name);
		System.out.println("합계=" + sum);
		System.out.println("평균=" + avg);
		System.out.println("학점=" + grade);
		System.out.println("결과=" + msg); // 합격, 불합격 안내 메시지 출력

	}

}
