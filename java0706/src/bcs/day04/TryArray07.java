package bcs.day04;

public class TryArray07 {

	public static void main(String[] args) {
		// ����) �ζ� ��ȣ ��÷�⸦ ������� �մϴ�.
		// ���� 6���� ���� lotto��� �̸��� �迭�� �����ϰ�
		// Math.random���� 1~45 ������ ���ڸ� �������� �߻����� ���ʷ� �迭�� �ְ�
		// �Ǹ�ŭ ����� ����ϼ���.
		// ��: 20 5 1 18 32 30
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			System.out.print(lotto[i] + "\t");
		}
	}// main end

}// class end
