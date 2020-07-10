package bcs.day02;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//kor: 국어성적, eng: 영어성적, sum: 성적합계, avg: 성적평균
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("국어성적을 입력하세요 : ");
		int kor=stdin.nextInt();
		
		System.out.print("영어성적을 입력하세요 : ");
		int eng=stdin.nextInt();
		
		String name="홍길동";
		
		int sum = 0;				
		double avg=0.0;
		
		//문제 1. 성적의 합과 평균을 구하는 식을 완성하시오.
		sum=(kor+eng);
		avg=(double)sum/2;
		
		//문제2. if문을 사용해서 평균이 70점 이상이면 '축합격', 0~69점은 '재시험'이라는 안내 메시지를 
		// 결과에 출력하세요.  
		String msg = "안내문을 여기에 작성";
		
		//if(avg>=70) msg="축합격";
		//else msg="재시험";
		
		//msg = (avg>=70) ? "축합격" : "재시험";
		
		if (avg >= 70) {
			if ( !(kor < 60) | !(eng < 60) )
			msg = "축합격";
			else msg = "불합격";
		}
		else
			msg = "과락";
		
		System.out.println("이름="+name);
		System.out.println("합계="+sum);
		System.out.println("평균="+avg);
		System.out.println("결과="+msg); //합격, 불합격 안내 메시지 출력
		
		stdin.close();

	}

}
