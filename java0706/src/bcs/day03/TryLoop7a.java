package bcs.day03;

public class TryLoop7a {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� ��: " + sum);

	}// main end

}// class end
