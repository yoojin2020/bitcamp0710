package bcs.day04;

public class TryArray06 {

	public static void main(String[] args) {
		// ����) ���� ���ῡ�� ġŲ, ����, ����, ¥���, ���� �߿� �ϳ��� ��޽�ų �����Դϴ�.
		// �׷��� ������ְ� �־ �������� �޴��� ���ϴ� ���α׷��� ¥������ �ؿ�.
		// menu ��� �迭�� �ϳ� ���� ���� �޴��� ���� ��,
		// Math.random���� 0~4 ������ ������ ���ڸ� �߻����Ѽ�
		// ��������� �� �������� �޴� �ϳ��� ��½�Ű���� �ۼ��� ������.
		String menu[] = { "ġŲ", "����", "����", "¥���", "����" };
		int ran = (int) (Math.random() * 5);

		System.out.println("���� ���� �޴��� " + menu[ran] + " �Դϴ�.");

	}// main end

}// class end
