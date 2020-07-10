package bcs.day03;

import java.util.Scanner;

public abstract class ReverseString {

	public static void main(String[] args) {
		//이것은 ReverseNumber.java와 비교하여 참고만 하세요. 
		//이해가 안되면 질문해 주시고, String과 관련된 메소드는 내일 다시 다룹니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("영어 단어를 입력하세요:");
        String str = scan.nextLine();
        for(int i=str.length(); i>0; i--) {
            System.out.print(str.charAt(i-1));
        }
        scan.close();
	}

}
