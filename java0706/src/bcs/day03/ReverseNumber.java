
package bcs.day03;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//키보드로 세자리 숫자를 입력받아서 순서를 뒤집어서 출력해 보세요. 예) 347 -> 743
		//while문을 사용하여 완성하세요.
		//힌트: 347을 10으로 나눈 나머지는 '7' 입니다. 
		int a, cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("세자리 숫자를 입력하세요:");
		int su = scan.nextInt();
        
		//이곳에 while문 작성
		while(true) {
			a = su % 10;
			su = su / 10;
			cnt++;
			System.out.print(a);
			
			if (cnt==3)
					break;
		}
		scan.close();

	}// main end

}// class end
