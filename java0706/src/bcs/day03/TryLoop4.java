package bcs.day03;

public class TryLoop4 {

	public static void main(String[] args) {
		// �ǽ�)num=����, tot=�հ��� ���� ��,
		// num�� �ϳ��� �������Ѽ� 1���� 10������ ���� for���� �Ἥ ���ϼ���.
		// ��µ� ���: 1 2 3 4 5 6 7 8 9 10 tot=55

		System.out.println("for�� ���� �ǽ�");
		int num = 0, tot = 0;
		// for(int a=1...
		for (int a = 1; a < 11; a++) {
			num++;
			System.out.print(num + "  ");
			tot += num;
		}

		System.out.print("tot=" + tot);

	}// main end

}// class end
