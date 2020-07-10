package bcs.day03;

public class GugudanWhile {
	public static void main(String[] args) {
		// 노가다로 작성한 Gugudan1.java를 참고하셔서 똑같이 출력되도록 while(true)문을 작성해보세요.
		// dan과 cnt를
		int dan = 7, cnt = 1;

		// while(true)...
		while (true) {
			System.out.println(dan + "*" + cnt + "=" + dan * cnt);
			cnt = cnt + 1;
			//cnt++;

			if (cnt == 10)
				break;
		}

	}// end
}// class END
