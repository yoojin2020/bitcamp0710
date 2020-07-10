package bcs.day05;

public class TryMethod2a {

	// main���� �迭�� ũ��(s)�� ���ؼ� �����ϸ�
	// makeArray��� �޼ҵ忡�� �̸� �޾� �ش� ���̸�ŭ�� ���������� ������ �ϴ� �迭�� return�ϰ�
	// (��: s=5�� ���, {1, 4, 9, 16, 25}
	// �� ���ϰ��� B��� �迭�� �Ҵ��Ͽ� ����Ϸ��� �մϴ�.
	// �޼ҵ带 �ϼ��ϰ� ������ �ذ��ϼ���.
	public static int[] makeArray(int size) {
		int[] A = new int[size];
		for(int i=0;i<size;i++)
				A[i]=(i+1)*(i+1);
		return A;
	}

	public static void main(String[] args) {
		int s = 7;
		int[] B = makeArray(s);
		for (int temp : B)
			System.out.print(temp+"\t");

	}// main end

}// class end
