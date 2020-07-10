package bcs.day03;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int month;
		
		do {
			System.out.print("월을 입력하세요.(끝 : 0) : ");
			month = stdin.nextInt();
			
			if(3<=month && month<=5)
				System.out.println("봄 입니다.");
			else if(6<=month && month<=8)
				System.out.println("여름 입니다.");
			else if(9<=month && month<=11)
				System.out.println("가을 입니다.");
			else if(month==1 || month==2 || month==12)
				System.out.println("겨울 입니다.");
			else if(month!=0)
				System.out.println("잘못된 입력 : 해당하는 계절이 없습니다.");
		} while(month!=0);
		System.out.println("감사합니다.");
		
		stdin.close();

	}// main end

}// class end
