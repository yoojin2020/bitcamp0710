package bcs.day05;

public class Method02 {

	public static void findpower(int x, int y) {
		int result = 1;
		for (int a = 1; a <= y; a++)
			result *= x;
		System.out.println(x + "의" + y + "제곱: " + result);
	}//매개변수는 있고 반환값이 없는 경우(입력만 있고 출력은 없음)

	public static void main(String[] args) {
		int a = 2, b = 10;
		findpower(a, b);

	}// main

	
}// class
