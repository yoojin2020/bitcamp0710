package bcs.day04;

public class TryArray07 {

	public static void main(String[] args) {
		// 문제) 로또 번호 추첨기를 만들려고 합니다.
		// 정수 6개가 들어가는 lotto라는 이름의 배열을 생성하고
		// Math.random으로 1~45 사이의 숫자를 랜덤으로 발생시켜 차례로 배열에 넣고
		// 탭만큼 띄워서 출력하세요.
		// 예: 20 5 1 18 32 30
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			System.out.print(lotto[i] + "\t");
		}
	}// main end

}// class end
