package bcs.day03;

public class IfTest5 {

	public static void main(String[] args) {
		int a = 5, b = 9, c = 12; // ������ ���� �־���
		int temp = 0; // temp�� ���ſ���

		// ����)if���� �Ἥ ������ ���� �� ���� ū ���� temp�� ��� ����ϼ���.

		if (a > b) 
			temp = a;
		else
			temp = b;
		
		if (c > temp)
			temp = c;

		System.out.println(a + " " + b + " " + c);
		System.out.println("�ִ밪 = " + temp);
	}

}
