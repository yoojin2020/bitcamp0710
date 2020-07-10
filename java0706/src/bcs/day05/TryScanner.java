package bcs.day05;

import java.util.Scanner;

public class TryScanner {
	
	//Scanner는 다양한 자료형을 읽어올 수 있는 메소드들이 있어서  
	//다양한 데이터 입출력을 처리하는데 유용합니다.
	//next()는 문자열을, nextInt()는 정수형 데이터를, nextFloat()는 float형 데이터를 읽어들입니다.
	//아래의 코드를 실행시키고 다른 데이터타입을 입력해서 에러를 발생시켜 보세요~
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("전화번호: ");
		String phone = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("키: ");
		float height = sc.nextFloat();
		System.out.print("성별: ");
		char gender = sc.next().charAt(0);
		
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phone);
		System.out.println("나이: "+ age);
		System.out.println("키: "+ height);
		System.out.println("성별: "+ gender);

	}//main end

}//class end
