package bcs.day05;

import java.util.Scanner;

public class TryMethod1 {
	
	//main �޼ҵ忡�� Ű���带 ���� ���� �ϳ��� �Է� �ް�,
	//�� ���ڸ� check() �Լ��� �����Ͽ� ¦������ Ȧ������ ������� ���� ���� ��
	//"a�� ¦���Դϴ�." �Ǵ� "a�� Ȧ���Դϴ�." �� �������� ����Ϸ��� �մϴ�.
	//�Ʒ��� �޼ҵ带 �ϼ��ϼ���(����Ÿ��, �Ű�����, Ȧ¦ �Ǻ��� �߰�)
	static boolean check(int x) {
		if(x%2==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a = sc.nextInt();
		if(check(a) == true)
			System.out.println(a + "�� ¦���Դϴ�.");
		else
			System.out.println(a + "�� Ȧ���Դϴ�.");
		sc.close();

	}//main end

}//class end
