package bcs.day05;

import java.util.Scanner;

public class TryScanner {
	
	//Scanner�� �پ��� �ڷ����� �о�� �� �ִ� �޼ҵ���� �־  
	//�پ��� ������ ������� ó���ϴµ� �����մϴ�.
	//next()�� ���ڿ���, nextInt()�� ������ �����͸�, nextFloat()�� float�� �����͸� �о���Դϴ�.
	//�Ʒ��� �ڵ带 �����Ű�� �ٸ� ������Ÿ���� �Է��ؼ� ������ �߻����� ������~
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("��ȭ��ȣ: ");
		String phone = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.print("Ű: ");
		float height = sc.nextFloat();
		System.out.print("����: ");
		char gender = sc.next().charAt(0);
		
		System.out.println("�̸�: "+ name);
		System.out.println("��ȭ��ȣ: "+ phone);
		System.out.println("����: "+ age);
		System.out.println("Ű: "+ height);
		System.out.println("����: "+ gender);

	}//main end

}//class end
