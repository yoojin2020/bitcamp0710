
package bcs.day03;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//Ű����� ���ڸ� ���ڸ� �Է¹޾Ƽ� ������ ����� ����� ������. ��) 347 -> 743
		//while���� ����Ͽ� �ϼ��ϼ���.
		//��Ʈ: 347�� 10���� ���� �������� '7' �Դϴ�. 
		int a, cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� ���ڸ� �Է��ϼ���:");
		int su = scan.nextInt();
        
		//�̰��� while�� �ۼ�
		while(true) {
			a = su % 10;
			su = su / 10;
			cnt++;
			System.out.print(a);
			
			if (cnt==3)
					break;
		}
		scan.close();

	}// main end

}// class end
