package bcs.day04;

public class TryArray03a {

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

		System.out.println("hap=" + hap);
		System.out.println("tot=" + tot);

	}// main end

}// class end
