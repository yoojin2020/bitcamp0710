package bcs.day03;

public class TryLoop5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				//2 4 6 8 10 <- �̷��� ¦���� ����Ϸ��� �մϴ�. �� �ڸ��� �˸��� ��ɾ �߰����ּ���.
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
