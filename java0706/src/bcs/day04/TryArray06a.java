package bcs.day04;

public class TryArray06a {

	public static void main(String[] args) {
		// ����) ���� ���ῡ�� ġŲ, ����, ����, ¥���, ���� �߿� �ϳ��� ��޽�ų �����Դϴ�.
		// �׷��� ������ְ� �־ �������� �޴��� ���ϴ� ���α׷��� ¥������ �ؿ�.
		// menu ��� �迭�� �ϳ� ���� ���� �޴��� ���� ��,
		// Math.random���� 0~4 ������ ������ ���ڸ� �߻����Ѽ�
		// ��������� �� �������� �޴� �ϳ��� ��½�Ű���� �ۼ��� ������.
		String[] menu = { "ġŲ", "����", "����", "¥���", "����" };
		double d = Math.random() * 5;
		int sel = (int) (d);
		System.out.println("���� ���� �޴��� " + menu[sel] + " �Դϴ�.");

	}// main end

}// class end
