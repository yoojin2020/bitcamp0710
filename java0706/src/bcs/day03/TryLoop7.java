package bcs.day03;

public class TryLoop7 {

	public static void main(String[] args) {
		int sum = 0;

		// �̰��� for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				//sum = sum + i;
				sum += i;
		}

		System.out.println("3�� ����� ��: " + sum);

	}// main end

}// class end
