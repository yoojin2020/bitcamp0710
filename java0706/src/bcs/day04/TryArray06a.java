package bcs.day04;

public class TryArray06a {

	public static void main(String[] args) {
		// 문제) 오늘 저녁에는 치킨, 족발, 피자, 짜장면, 보쌈 중에 하나를 배달시킬 예정입니다.
		// 그런데 선택장애가 있어서 랜덤으로 메뉴를 정하는 프로그램을 짜보려고 해요.
		// menu 라는 배열을 하나 만들어서 위의 메뉴를 넣은 후,
		// Math.random으로 0~4 사이의 임의의 숫자를 발생시켜서
		// 실행시켰을 때 랜덤으로 메뉴 하나를 출력시키도록 작성해 보세요.
		String[] menu = { "치킨", "족발", "피자", "짜장면", "보쌈" };
		double d = Math.random() * 5;
		int sel = (int) (d);
		System.out.println("오늘 저녁 메뉴는 " + menu[sel] + " 입니다.");

	}// main end

}// class end
