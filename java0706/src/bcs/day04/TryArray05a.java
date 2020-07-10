package bcs.day04;

public class TryArray05a {

	public static void main(String[] args) {
		int a = 5, b = 10, c = 4, d = 2, e = 8, f = 5;
		int[] su = { 5, 10, 4, 2, 8, 5 };

		int hap = 0, tot = 0;
		// ����1) ���� ���� �־����� �� hap���� a~f������ ����,
		// tot���� for���� ����Ͽ� �迭(su) ���� ������ ���Ͽ�
		// hap=xx
		// tot=xx �� �������� ����ϼ���
		hap = a + b + c + d + e + f;
		for (int i = 0; i < su.length; i++) {
			tot += su[i]; // ���Կ���
		}

		// ����2) ����1���� 2���� �迭�� �߰��Ǿ����ϴ�.
		// �̹����� sum�� ��ø for���� ����Ͽ� �迭(score)�� ������ ���� ���ؼ�
		// ������ ���� ���� �Ʒ��� ����ϼ���.
		double score[][] = { // 4��x2���� 2���� �迭
				{ 3.3, 3.4 }, // 1�г� 1, 2�б� ����
				{ 3.5, 3.6 }, // 2�г� 1, 2�б� ����
				{ 3.7, 4.0 }, // 3�г� 1, 2�б� ����
				{ 4.1, 4.2 } // 4�г� 1, 2�б� ����
		};

		double sum = 0.0;

		for (int k = 0; k < 4; k++) { // ��
			for (int j = 0; j < 2; j++) { // �� k=0�϶� j=0,1
				sum = sum + score[k][j];
			} // j end
		} // k end

		// ����3) �������� �������� ���� ���������� score�� ��� ����(avg)�� ���Ϸ��� �մϴ�.
		// �迭(score)�� ���� ����(row)�� ���� ����(col)�� ���� ���ϰ�,
		// ��� ���� ���̸� ���� ��ü �������� ����(cnt)�� ���� ��, ���(avg)�� ���� ����ϼ���.
		int row, col, cnt;
		double avg = 0.0;

		row = score.length;
		col = score[2].length;
		
		cnt = row * col;
		avg = sum/cnt;

		System.out.println("hap=" + hap);
		System.out.println("tot=" + tot);
		System.out.println("sum=" + sum);
		System.out.printf("avg=%3.1f", avg);

	}// main end

}// class end
