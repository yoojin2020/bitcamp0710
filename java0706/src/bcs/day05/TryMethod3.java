package bcs.day05;

public class TryMethod3 {

	// ����) ���� �����Ҵ� �ζǹ߻��⸦ �޼ҵ带 �Ἥ �����غ����� �մϴ�.
	// lottoInput���� Math.random()�� ����Ͽ� 6���� ���� �迭�� �����ϰ�,
	// lottoOutput���� �ش� �迭�� �Ű������� �޾� ������ ����ϵ��� �޼ҵ带 �ϼ��ϼ���.
	// ���������� 0709\answer\TryArray08a.java�� �����Ͻʽÿ�.
	public static void main(String[] args) {
		TryMethod3 my = new TryMethod3();
		int[] a = my.lottoInput();
		my.lottoOutput(a);

	}// main end

	public int[] lottoInput() {// ���ϰ�
		int[] data = new int[6];
		for (int i = 0; i < 6; i++) {
			data[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++)
				if (data[i] == data[j]) {
					i--;
					break;
				}
		}

		return data;
	}// lottoInput end

	public void lottoOutput(int[] b) { // �Ű�����
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");

	}// lottoOutput end

}// class end
