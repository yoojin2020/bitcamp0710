package bcs.day04;

import java.util.Scanner;

public class ArraysTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int i;
		double sum = 0.0, avg;

		System.out.print("dnum�� ���� �Է� : ");
		int j = stdin.nextInt();
		double[] dnum = new double[j];
		System.out.println("double dnum�� ���� : " + dnum.length);
		System.out.println("�ʱ�ȭ ���� ���� dnum[]�� �� : ");
		for (i = 0; i < dnum.length; i++)
			System.out.print(dnum[i] + " ");
		System.out.println();

		for (i = 0; i < dnum.length; i++) {
			System.out.print("dnum[" + i + "]��° ������ �Է� : ");
			dnum[i] = stdin.nextDouble();
		}

		for (i = 0; i < dnum.length; i++)
			sum += dnum[i];
		System.out.println("�迭�� ���� " + sum + "�Դϴ�.");
		avg = sum / dnum.length;
		System.out.println("�迭�� ����� " + avg + "�Դϴ�.");

	}// main end

}// class end
