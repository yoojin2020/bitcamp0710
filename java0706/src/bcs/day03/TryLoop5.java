package bcs.day03;

public class TryLoop5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				//2 4 6 8 10 <- 이렇게 짝수만 출력하려고 합니다. 이 자리에 알맞은 명령어를 추가해주세요.
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
