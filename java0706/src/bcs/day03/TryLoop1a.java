package bcs.day03;

public class TryLoop1a {

	public static void main(String[] args) {
		// �ǽ�)num=����, tot=�հ��� ���� ��,
		// num�� �ϳ��� �������Ѽ� 1���� 10������ while(true)�� �Ἥ ���ϼ���.
		// ��µ� ���: 1 2 3 4 5 6 7 8 9 10 tot=55

		System.out.println("while(true)���� �ǽ�");
		int num = 0, tot = 0;

		while (true) {
			num = num + 1;
			System.out.print(num + "  ");
			tot = tot + num;
			if (num == 10) {
				break;
			}
		}

		System.out.print("tot=" + tot);

	}// main end

}// class end
